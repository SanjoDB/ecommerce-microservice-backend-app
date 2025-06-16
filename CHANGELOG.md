# [1.4.0](https://github.com/SanjoDB/ecommerce-microservice-backend-app/compare/v1.3.1...v1.4.0) (2025-06-16)


### Features

* Add design patterns, Merge pull request [#2](https://github.com/SanjoDB/ecommerce-microservice-backend-app/issues/2) from SanjoDB/feature/DisignPatterns ([583ef57](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/583ef57bbecb31373ee1ad0576c5132ed1150b95))
* Add Rate Limiter Desing Pattern AND Add documentation ([08fdb6f](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/08fdb6f256bf2c038a812e7455becba186fb0920))
* Add Retry Desing Pattern AND Add documentation ([8750f96](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/8750f960249d90c877f1ba84ef2452666b65427f))

## [1.3.1](https://github.com/SanjoDB/ecommerce-microservice-backend-app/compare/v1.3.0...v1.3.1) (2025-06-16)


### Bug Fixes

* correct paths for observability stack deployment ([d904ec6](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/d904ec649cca4d73178e27b1d608404aedb212b4))

# [1.3.0](https://github.com/SanjoDB/ecommerce-microservice-backend-app/compare/v1.2.4...v1.3.0) (2025-06-16)


### Features

* add Prometheus, Grafana and ELK stack deployment to Terraform pipeline ([eed9df0](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/eed9df0c8560537c7039e4e630cb0747cb40e981))

## [1.2.4](https://github.com/SanjoDB/ecommerce-microservice-backend-app/compare/v1.2.3...v1.2.4) (2025-06-16)


### Bug Fixes

* update module paths for stage and dev environments ([b5aae8a](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/b5aae8aaf9926de6fe1b70918f14ffe6c48be37d))

## [1.2.3](https://github.com/SanjoDB/ecommerce-microservice-backend-app/compare/v1.2.2...v1.2.3) (2025-06-16)


### Bug Fixes

* update module paths to ../../modules for correct resolution ([e925a9b](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/e925a9b3091492bbff419477dbd79c4e48edd7da))

## [1.2.2](https://github.com/SanjoDB/ecommerce-microservice-backend-app/compare/v1.2.1...v1.2.2) (2025-06-16)


### Bug Fixes

* correct path to Terraform files by adding 'infra/' prefix ([a8408f8](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/a8408f858f5f98d0b33642808d9924d2d0486f79))

## [1.2.1](https://github.com/SanjoDB/ecommerce-microservice-backend-app/compare/v1.2.0...v1.2.1) (2025-06-16)


### Bug Fixes

* prevent Terraform init failure by correcting Jenkinsfile checkout logic ([ef6b294](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/ef6b29481897bbf656a4c965b6b8f137af29dfee))

# [1.2.0](https://github.com/SanjoDB/ecommerce-microservice-backend-app/compare/v1.1.0...v1.2.0) (2025-06-16)


### Features

* Add rollback plan documentation ([fd10e65](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/fd10e6558369aa69c782d39ea65ed2a93c7aabca))

# [1.1.0](https://github.com/SanjoDB/ecommerce-microservice-backend-app/compare/v1.0.0...v1.1.0) (2025-06-16)


### Features

* Add Pipeline for deploy terraform ([d775923](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/d7759232178aae73f8331d29e38ef168a20ce139))
* add Terraform for Dev enviroment ([7ac530a](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/7ac530a083db23144c9b7323f8c2278b6357fe7f))
* add Terraform for Prod enviroment and add modules for monitoring ([403d35a](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/403d35ad9a5d295ead383fc0b936510ba914d2bb))
* Add Terraform, Merge pull request [#1](https://github.com/SanjoDB/ecommerce-microservice-backend-app/issues/1) from SanjoDB/feature/Terraform ([6e9db53](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/6e9db539263e7e5b060436831bb78f66d97ac828))
* feat: add Terraform for Stage enviroment ([e55d22f](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/e55d22f9fd7e3dc2b014c35afce5cc72bce9dd34))

# 1.0.0 (2025-06-15)


### Bug Fixes

* add kubernets logic ([030fe94](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/030fe949b8272117b7ab05d17fd8a88d90c6e58b))
* add locus test to logic ([014d839](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/014d839dc73ccddc32f9402035102502829d08a1))
* cloud-config kubernets timeout ([4ed152f](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/4ed152fcee75d96e69895d37b7a16841356f9259))
* datasource modified ([42806b1](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/42806b1d7c4eaff3ef9728a65ecc526e09a51bcb))
* deploy minimum Microservices ([d8a094a](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/d8a094ab8710e5de59dba90da447c27b3ab7a506))
* E2E tests ([f3422e2](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/f3422e24f96778671ed538cd8f416da7cadae33d))
* E2E tests ([c6eb794](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/c6eb794d2ef6329998581e1769d8311087b218ea))
* identation of Jenkinsfile ([00979d4](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/00979d475eb4c1749623dd5bbcd0db3ecf5b3526))
* Jenkinsfile branch logic ([39d1b18](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/39d1b18404a9eb9ab56822c565cf55aff509c162))
* Jenkinsfile credentials modified ([6c1272d](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/6c1272d2ba8f77dc9a6b5cf2cdf0f9fa35e9a33d))
* Jenkinsfile identation ([c5efdb8](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/c5efdb86253e3301cb7e9acad52cc53e8a17473d))
* jenkinsfile logic ([c2ceaf5](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/c2ceaf521376abfc876011bb0833522ada5727d3))
* k8s image and namespace ([07b6c11](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/07b6c115b8eed13a34b28b5e26329829ae52b9c7))
* k8s jenkinsfile logic ([4b72073](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/4b7207358fd312c5c4902a90897bca3386e282f4))
* k8s namespace.yaml ([a0fabd0](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/a0fabd0b8e9b233bd2049839308490f36dae1ac8))
* k8s service.yaml namespace ([e66c9e6](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/e66c9e68ff45f1ba2fa2938979d291f9fb3eb7a1))
* k8s timeout ([156b2fd](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/156b2fd507db846e786021f1afd9fc384dff2561))
* locust profile branch ([e9066cc](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/e9066cc747908ea73f9def8f5e949d763a830112))
* Microservices Dockerfile ([896426d](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/896426d6ca5434c6b1472a1abb1796fe7ed3b8fb))
* Microservices timeout ([c9f9466](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/c9f9466826d0c6b978bcf28a3bc60fb1d2bb0b67))
* namespace k8s api-gateway ([d45a634](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/d45a634c6005c0d52d15d42c2ebb99ffe9a571f6))
* notification email ([9462018](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/9462018c9e1b6aedd57b7f8ce8d88318b2321cc9))
* re made docker images ([b385beb](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/b385bebf2212f02dbdb0547d9e7c6ffc6f268c59))
* shipping application-stage.yml modified ([22afb10](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/22afb104a7dce0fa3b19df737e98a319c9aff589))
* Spring profiles modified ([f7640c2](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/f7640c29770721fb60a1bc9e908b76fc7b81b71f))
* Update README.md ([b460d9b](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/b460d9b58b5c2181560edb73fdca20476d0ffb96))
* Update README.md ([45dc2cd](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/45dc2cd2d18e15277914723d0a22483c4c41b7c4))


### Features

* add auto release tag with semantic commits ([fb7669f](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/fb7669f73a17ffe761ac313932da6f331adf5705))
* add image ([2f9b315](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/2f9b315cde8cfb3f77332f998dff3ee079cf0b3f))
* add images ([cbd2016](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/cbd201631b0f6126c71608675b17cc692dc7cb88))
* add images ([7997f56](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/7997f56f278c54ca8fba356ed5a43a2eed3fe48f))
* add images ([34973af](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/34973affec834308e5175ba10bba22fc25f15c69))
* add k8s and Jenkinsfile ([08a6c06](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/08a6c06da105e5e3dc59a25c78f3ba7a53046821))
* add locust for load and stress test ([e14d7c8](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/e14d7c80a9d1e90ce18acc9ea034236dadc82a5a))
* add notification via email ([977adce](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/977adce1c8084a7650047a3a94edb1d2813b4145))
* add OWASP ZAP scan ([edba31e](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/edba31e1069da676a2e8e525889a688a06dc39f0))
* add prometheus and grafana logic ([007698f](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/007698f0d0df9f40bdab7635524ad9a8754a8d51))
* add report to README.md ([fc28783](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/fc28783974d5dd6660df6eefd74622816e371996))
* add sonarqube ([adb36b7](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/adb36b77743ba9d1ca1b420064c2da8c19848644))
* add Trivy logic ([d978bd9](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/d978bd9a0a86f684e0c55ab9626f4ce71d1bd09a))
* add unit, integration and E2E tests ([79fd739](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/79fd73968c2b76f3bcb6ab281be70ec9e8480410))
* release notes and reports ([2960469](https://github.com/SanjoDB/ecommerce-microservice-backend-app/commit/2960469a4415f480bd758c1ec1e91a833bf697c6))
