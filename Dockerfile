# Use an official OpenJDK image as the base image
FROM openjdk:17

# Set the working directory inside the container
WORKDIR /app

# Copy all Java source files into the container
COPY . /app

# List files to debug if necessary
RUN ls -la /app

# Compile all Java files
RUN javac /app/StudentGradeManagement.java

# Run the Java application
CMD ["java", "-cp", "/app", "StudentGradeManagement"] && exit 0
