terraform {
  required_version = ">= 1.3.0"

  required_providers {
    google = {
      source  = "hashicorp/google"
      version = ">= 5.20.0"
    }
    google-beta = {
      source  = "hashicorp/google-beta"
      version = ">= 5.20.0"
    }
    kubernetes = {
      source  = "hashicorp/kubernetes"
      version = ">= 2.23.0"
    }
  }
}

data "google_client_config" "default" {}

locals {
  environment = "prod"
  common_tags = {
    Environment = "production"
    Project     = "ecommerce"
    ManagedBy   = "terraform"
  }
}

module "vpc" {
  source = "../../modules/vpc"
  
  project_id   = var.project_id
  region       = var.region
  environment  = local.environment
  
  vpc_name = "${var.project_name}-vpc-${local.environment}"
  
  subnet_cidr = var.subnet_cidr_range
  pods_cidr   = var.pods_secondary_range_cidr
  services_cidr = var.services_secondary_range_cidr
}

module "gke" {
  source = "../../modules/gke"
  
  project_id  = var.project_id
  region      = var.region
  environment = local.environment
  
  cluster_name = "${var.project_name}-cluster-${local.environment}"
  
  vpc_name            = module.vpc.vpc_name
  subnet_name         = module.vpc.subnet_name
  pods_range_name     = module.vpc.pods_range_name
  services_range_name = module.vpc.services_range_name
  
  machine_type       = var.gke_machine_type
  min_node_count     = var.gke_min_nodes
  max_node_count     = var.gke_max_nodes
  initial_node_count = var.gke_initial_nodes
  disk_size_gb       = var.gke_disk_size
  disk_type          = var.gke_disk_type
  preemptible        = var.gke_preemptible
  
  depends_on = [module.vpc]
}

module "artifact_registry" {
  source = "../../modules/artifact-registry"
  
  project_id  = var.project_id
  location    = var.region
  environment = local.environment
  
  repository_id  = "${var.project_name}-repo-${local.environment}"
  description    = "Docker repository for eCommerce microservices (${local.environment})"
  
  cleanup_policy_dry_run = var.artifact_cleanup_dry_run
  
  depends_on = [module.gke]
}