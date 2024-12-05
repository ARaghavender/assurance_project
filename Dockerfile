# Use a Maven base image with JDK 17
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml and download the dependencies
COPY pom.xml .

# Cache dependencies for faster builds
RUN mvn dependency:go-offline

# Copy the rest of the application source code
COPY src ./src

# Build the project
RUN mvn clean install

# Use a smaller JRE image to run the app
FROM openjdk:17-jre-slim

# Copy the JAR file from the build stage
COPY --from=build /app/target/productcrudapp-1.0-SNAPSHOT.jar /app/productcrudapp.jar

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "/app/productcrudapp.jar"]
