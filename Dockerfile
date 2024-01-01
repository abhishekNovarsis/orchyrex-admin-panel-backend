# Stage 1: Build Stage
FROM maven:3.8.3-openjdk-17 AS build
WORKDIR /Demo
COPY . .
RUN mvn clean package -DskipTests

# Stage 2: Runtime Stage
FROM openjdk:17-jdk-slim
WORKDIR /Demo
COPY --from=build /Demo/target/Orchyrex-Backend-0.0.1-SNAPSHOT.jar Orchyrex-Backend-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "Orchyrex-Backend-0.0.1-SNAPSHOT.jar"]
