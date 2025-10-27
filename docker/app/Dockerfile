#===============BUILD
FROM maven:3.9-eclipse-temurin-21 as build
WORKDIR /app
COPY pom.xml .
COPY src/ ./src
RUN mvn  -DskipTests package

#==================== runtime

FROM amazoncorretto:21-alpine3.19
WORKDIR /app
COPY --from=build /app/target/*.jar ./app.jar
EXPOSE 8080
ENV SPRING_PROFILES_ACTIVE=k8s
ENTRYPOINT ["java", "-jar", "app.jar"]