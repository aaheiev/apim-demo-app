FROM openjdk:17-jdk-slim-buster
EXPOSE 8080:8080
RUN mkdir /app
COPY target/apim-demo-app-0.0.1-SNAPSHOT.jar /app
WORKDIR /app
CMD ["java", "-jar", "apim-demo-app-0.0.1-SNAPSHOT.jar"]