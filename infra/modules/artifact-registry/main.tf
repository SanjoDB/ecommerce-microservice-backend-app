resource "google_artifact_registry_repository" "ecommerce_repo" {
  repository_id = var.repository_id
  location      = var.location
  format        = var.format
  description   = var.description

  labels = {
    environment = var.environment
    project     = "ecommerce-microservices"
    managed_by  = "terraform"
  }
}

resource "google_artifact_registry_repository_iam_member" "gke_reader" {
  repository = google_artifact_registry_repository.ecommerce_repo.name
  location   = google_artifact_registry_repository.ecommerce_repo.location
  role       = "roles/artifactregistry.reader"
  member     = "serviceAccount:${data.google_project.current.number}-compute@developer.gserviceaccount.com"
}

resource "google_service_account" "artifact_registry_sa" {
  account_id   = "${var.repository_id}-cicd-sa"
  display_name = "Artifact Registry CI/CD Service Account"
  description  = "Service account for CI/CD operations with Artifact Registry"
}

resource "google_artifact_registry_repository_iam_member" "cicd_writer" {
  repository = google_artifact_registry_repository.ecommerce_repo.name
  location   = google_artifact_registry_repository.ecommerce_repo.location
  role       = "roles/artifactregistry.writer"
  member     = "serviceAccount:${google_service_account.artifact_registry_sa.email}"
}

resource "google_service_account_key" "artifact_registry_key" {
  service_account_id = google_service_account.artifact_registry_sa.name
  public_key_type    = "TYPE_X509_PEM_FILE"
}

resource "google_secret_manager_secret" "artifact_registry_key" {
  secret_id = "${var.repository_id}-cicd-key"

  labels = {
    environment = var.environment
    purpose     = "cicd"
  }
  replication {
    auto {}
  }
}

resource "google_secret_manager_secret_version" "artifact_registry_key" {
  secret      = google_secret_manager_secret.artifact_registry_key.id
  secret_data = base64decode(google_service_account_key.artifact_registry_key.private_key)
}

data "google_project" "current" {
  project_id = var.project_id
}