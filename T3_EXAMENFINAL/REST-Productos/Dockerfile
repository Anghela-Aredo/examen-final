# Usar una imagen base de Java
FROM openjdk:17-jdk-slim

# Establecer el directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado por Maven/Gradle
COPY target/REST-Productos-0.0.1-SNAPSHOT.jar productos.jar

# Exponer el puerto que usa el microservicio
EXPOSE 8083

# Comando para ejecutar el microservicio
ENTRYPOINT ["java", "-jar", "productos.jar"]

