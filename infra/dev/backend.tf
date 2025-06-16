terraform {  
  backend "gcs" {
    bucket = "bucket-terraform-state-devv"
    prefix = "terraform/state"
  }
}