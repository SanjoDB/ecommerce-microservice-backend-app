# Plan de Rollback para eCommerce Microservices

## 1. Introducción

Este documento describe el plan detallado de rollback para el sistema de microservicios eCommerce. El objetivo es restaurar el sistema a un estado estable anterior en caso de fallos críticos tras un despliegue, minimizando el impacto en los usuarios y asegurando la integridad de los datos. El repositorio implementa un esquema de releases etiquetados, lo que permite identificar y restaurar versiones previas de manera controlada.

---

## 2. Escenarios que Activan el Rollback

- Fallo en los health checks de los microservicios tras el despliegue.
- Errores críticos detectados en logs, monitoreo o alertas.
- Fallos en pruebas E2E, de integración o de rendimiento post-despliegue.
- Reportes de usuarios sobre mal funcionamiento inmediato tras el release.
- Despliegue de una versión incorrecta o con configuraciones erróneas.

---

## 3. Pre-requisitos

- Releases etiquetados en el repositorio (Git tags).
- Imágenes Docker versionadas y almacenadas en Docker Hub (`sanjodb/service-name:tag`).
- Acceso a los manifiestos de Kubernetes de versiones anteriores.
- Permisos para ejecutar comandos en Jenkins, Kubernetes y Docker Hub.

---

## 4. Pasos del Rollback

### 4.1 Identificación y Decisión

1. Detectar el fallo mediante monitoreo, alertas o pruebas automatizadas.
2. Notificar al equipo responsable y documentar el incidente.
3. Decidir el rollback tras evaluación rápida del impacto.

### 4.2 Aislamiento

1. Si es necesario, poner el sistema en modo mantenimiento (deshabilitar Ingress o API Gateway).
2. Comunicar a los usuarios sobre la interrupción temporal.

### 4.3 Restauración de la Versión Anterior

#### 4.3.1 Código y Configuración

- Identificar el tag de release anterior en Git (ejemplo: `v1.1.0`).
- Recuperar los manifiestos Kubernetes y archivos de configuración asociados a ese release.

#### 4.3.2 Imágenes Docker

- Verificar que las imágenes Docker del release anterior existen en Docker Hub (`sanjodb/service-name:latest`).
- Modificar los manifiestos de Kubernetes para apuntar a las imágenes del release anterior.

  ```yaml
  # Ejemplo de cambio en el deployment
  image: sanjodb/user-service:latest
  ```

(La imagen latest es una imagen docker general que no es creada por medio de los pipelines, puede usarse como punto de referencia en caso de que las imagenes creadas por los pipelines que usan etiquetas :prod, :dev o :stage esten corruptas)

#### 4.3.3 Despliegue

- Aplicar los manifiestos antiguos:
  ```bash
  kubectl apply -f k8s/[servicio]/deployment.yaml -n ecommerce
  ```
- Si se usa Jenkins, ejecutar el pipeline de rollback apuntando al tag anterior.

### 4.4 Verificación

1. Esperar a que los pods estén en estado `Running` y los health checks sean exitosos:
   ```bash
   kubectl get pods -n ecommerce
   kubectl logs -n ecommerce [pod]
   ```
2. Ejecutar pruebas rápidas (smoke tests) y monitorear logs.
3. Validar endpoints críticos y flujos de usuario.

### 4.5 Reapertura del Tráfico

1. Habilitar nuevamente el acceso externo (Ingress/API Gateway).
2. Notificar a los usuarios y stakeholders que el sistema está restaurado.

### 4.6 Documentación y Postmortem

1. Registrar el incidente, causas y acciones tomadas.
2. Analizar el fallo para prevenir recurrencias.
3. Actualizar el pipeline para automatizar el rollback si es posible.

---

## 6. Referencias

- [README.md](../README.md)
- [Jenkinsfile](../Jenkinsfile)
- [k8s/](../k8s/)
- [Docker Hub: sanjodb](https://hub.docker.com/u/sanjodb)

---