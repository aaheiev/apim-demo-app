
### set version
```shell
mvn versions:set -DnewVersion=0.0.5-SNAPSHOT
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