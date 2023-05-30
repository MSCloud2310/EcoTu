# Define la imagen base
FROM openjdk:17-jdk-alpine

# Establece el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copia el archivo JAR de la aplicación a la imagen
COPY target/ecotuAPI-0.0.1-SNAPSHOT.jar .

# Expone el puerto en el que se ejecuta la aplicación
EXPOSE 8088

# Comando para ejecutar la aplicación cuando se inicie el contenedor
CMD ["java", "-jar", "ecotuAPI-0.0.1-SNAPSHOT.jar"]