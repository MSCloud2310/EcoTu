# Usa una imagen base de Java
FROM openjdk:17-jdk-alpine

# Establece el directorio de trabajo en /app
WORKDIR /app

# Copia el archivo JAR de la aplicación en el contenedor
COPY target/discoveryService-0.0.1-SNAPSHOT.jar .

# Expone el puerto 8761 utilizado por Eureka Server
EXPOSE 8761

# Comando para ejecutar la aplicación cuando el contenedor se inicie
CMD ["java", "-jar", "discoveryService-0.0.1-SNAPSHOT.jar"]