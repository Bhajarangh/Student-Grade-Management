# Use an official OpenJDK image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy the Java source file
COPY StudentGradeManagement.java .

# Compile the Java file
RUN javac StudentGradeManagement.java 

# Run the Java application
CMD ["java", "StudentGradeManagement"]

