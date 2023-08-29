# CI / CD (from local environment)

## Build

### set version
```shell
mvn versions:set -DnewVersion=2.0.1-SNAPSHOT
```

### get version
```shell
mvn help:evaluate -Dexpression=project.version -q -DforceStdout
```

### build
```shell
mvn clean install
```

### docker build
```shell
docker build --platform linux/amd64 --build-arg version=0.0.5-SNAPSHOT -t gcacrapim.azurecr.io/apim-demo-app:0.0.5-SNAPSHOT .
```

### login acr
```shell
az acr login --name gcacrapim
```

### docker push
```shell
docker push gcacrapim.azurecr.io/apim-demo-app:0.0.5-SNAPSHOT
```

## Deploy to Kubernetes

### Dev

```shell
helm -n apim-be-dev upgrade --install  apim-demo-app ./charts/apim-demo-app --dry-run
helm -n apim-be-dev upgrade --install  apim-demo-app ./charts/apim-demo-app --wait
```