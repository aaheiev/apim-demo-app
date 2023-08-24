# Kubernetes Infra

namespaces

- apim-be-dev
- apim-be-test
- apim-be-prod

## Dev

```shell
helm -n apim-be-dev upgrade --install  apim-demo-app ./charts/apim-demo-app --dry-run
helm -n apim-be-dev upgrade --install  apim-demo-app ./charts/apim-demo-app --wait
```