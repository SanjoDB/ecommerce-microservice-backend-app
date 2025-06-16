terraform {
  backend "gcs" {
    bucket  = "bucket-terraform-state-prod"
    prefix  = "terraform/state"
  }
}