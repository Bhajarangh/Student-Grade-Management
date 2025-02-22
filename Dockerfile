# Use an official OpenJDK image as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source file into the container
COPY StudentGradeManagement.java .

# Compile the Java file
RUN javac StudentGradeManagement.java

# Set the command to run the Java application
CMD ["java", "StudentGradeManagement"]
