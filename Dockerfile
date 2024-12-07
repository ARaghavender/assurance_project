# Use an official Maven image to build your application
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml and source code into the container
COPY pom.xml ./
COPY src ./src

# Build the application (including test and mutation testing)
RUN mvn clean install

# Use a smaller image to run the application
FROM openjdk:17-jdk-slim

# Copy the built jar file from the build stage
COPY --from=build /app/target/productcrudapp-1.0-SNAPSHOT.jar /app/productcrudapp.jar

# Expose the port (if needed, for your application)
EXPOSE 8080

# Command to run the application
CMD ["java", "-jar", "/app/productcrudapp.jar"]
