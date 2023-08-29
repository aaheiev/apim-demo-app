FROM --platform=linux/amd64 openjdk:17-jdk-slim-buster

ARG version=0.0.1
ARG mvn_version=0.0.1-SNAPSHOT

ENV VERSION $version
ENV MVN_VERSION $mvn_version

RUN mkdir /app

COPY target/apim-demo-app-${MVN_VERSION}.jar /app/apim-demo-app.jar

WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "apim-demo-app.jar"]
