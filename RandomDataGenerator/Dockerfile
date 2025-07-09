FROM maven:3.9.4-eclipse-temurin-21 AS build

WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY --from=build /app/target/RandomDataGenerator-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
