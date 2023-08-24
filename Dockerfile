FROM --platform=linux/amd64 openjdk:17-jdk-slim-buster

ARG version=0.0.1-SNAPSHOT
ENV VERSION $version

EXPOSE 8080
RUN mkdir /app

COPY target/apim-demo-app-${VERSION}.jar /app/apim-demo-app.jar

WORKDIR /app

CMD ["java", "-jar", "apim-demo-app.jar"]
