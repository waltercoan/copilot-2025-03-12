# Stage 1: Build the application
FROM maven:3.8.4-openjdk-17 AS build

# Set the working directory
WORKDIR /app

# Copy the pom.xml file and download dependencies
COPY pom.xml .
COPY copilot-dia1/pom.xml ./copilot-dia1/
RUN mvn dependency:go-offline

# Copy the source code and build the application
COPY src ./src
COPY copilot-dia1/src ./copilot-dia1/src
RUN mvn clean package -f copilot-dia1/pom.xml

# Stage 2: Create the runtime image
FROM openjdk:17-jdk-slim

# Set the working directory
WORKDIR /app

# Copy the built application from the previous stage
COPY --from=build /app/copilot-dia1/target/copilot-dia1-1.0-SNAPSHOT.jar ./app.jar

# Expose the application port
EXPOSE 8080

# Define the entry point for the container
ENTRYPOINT ["java", "-jar", "app.jar"]