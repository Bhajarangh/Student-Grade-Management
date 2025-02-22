class Student {
    private String name;
    private int[] marks;
    private double average;
    private String grade;

    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateAverageAndGrade();
    }

    private void calculateAverageAndGrade() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        this.average = (double) sum / marks.length;

        if (average >= 90) grade = "A";
        else if (average >= 80) grade = "B";
        else if (average >= 70) grade = "C";
        else if (average >= 60) grade = "D";
        else grade = "F";
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.print("Marks: ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.printf("\nAverage: %.2f\n", average);
        System.out.println("Grade: " + grade);
        System.out.println("------------------------");
    }
}

public class StudentGradeManagement {
    public static void main(String[] args) {
        // Predefined data (No user input needed)
        Student[] students = {
            new Student("Alice", new int[]{85, 90}),
            new Student("Bob", new int[]{70, 80})
        };

        System.out.println("\n--- Student Results ---");
        for (Student student : students) {
            student.displayDetails();
        }
    }
}
