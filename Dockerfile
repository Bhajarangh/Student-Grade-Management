# Use an official OpenJDK image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy only Java source files to prevent unnecessary files from being added
COPY StudentGradeManagement.java .

# Compile the Java files
RUN javac StudentGradeManagement.java Student.java

# Run the Java application
CMD ["java", "StudentGradeManagement"]
