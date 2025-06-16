terraform {
    backend "gcs" {
    bucket = "bucket-terraform-state-stage"
    prefix = "terraform/state"
  }
}