FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY target/myapp.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]
