FROM docker.io/maven:3.9.0-eclipse-temurin-17-focal AS build
WORKDIR /app
ENV DATABASE_IP=localhost
ENV DB_DATABASE=interactions_opc
ENV DB_USER=root
ENV DB_PASSWORD=admin
ENV PORT=8082
COPY . .
RUN mvn install
RUN mvn clean package
FROM docker.io/eclipse-temurin:17-jdk-alpine
COPY target/interaction-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar","interaction-0.0.1-SNAPSHOT.jar"]