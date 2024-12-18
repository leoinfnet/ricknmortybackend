FROM amazoncorretto:21
LABEL authors="leonardogloria"
WORKDIR app
COPY rmbackend-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]