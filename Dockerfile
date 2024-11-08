# Use the official OpenJDK 19 image as a base image
FROM openjdk:19-jdk-alpine

# Add the packaged jar file to the container
ADD target/springboot-eks.jar springboot-eks.jar

# Expose the port the application runs on
EXPOSE 8080

# Run the jar file
ENTRYPOINT ["java", "-jar", "springboot-eks.jar"]