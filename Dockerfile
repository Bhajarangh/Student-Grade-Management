# Use an official OpenJDK image as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy all necessary files to the container
COPY . .

# Compile all Java files
RUN javac StudentGradeManagement.java

# Set the entry point to run the Java application
CMD ["java", "StudentGradeManagement"]
