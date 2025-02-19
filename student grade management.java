import java.util.Scanner;

class Student {
    private String name;
    private int[] marks;
    private double average;
    private String grade;

    public Student(String name, int subjects) {
        this.name = name;
        this.marks = new int[subjects];
    }

    public void inputMarks(Scanner sc) {
        int sum = 0;
        for (int i = 0; i < marks.length; i++) {
            while (true) {
                System.out.print("Enter marks for subject " + (i + 1) + ": ");
                if (sc.hasNextInt()) {
                    marks[i] = sc.nextInt();
                    sum += marks[i];
                    break;
                } else {
                    System.out.println("Invalid input. Please enter an integer.");
                    sc.next(); // Consume invalid input
                }
            }
        }
        average = (double) sum / marks.length;
        calculateGrade();
    }

    private void calculateGrade() {
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
    }
}

public class StudentGradeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = sc.nextInt();
        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();

        Student[] students = new Student[numStudents];

        for (int i = 0; i < numStudents; i++) {
            sc.nextLine(); // Consume newline
            System.out.print("Enter name of student " + (i + 1) + ": ");
            String name = sc.nextLine();
            students[i] = new Student(name, numSubjects);
            students[i].inputMarks(sc);
        }

        System.out.println("\n--- Student Results ---");
        for (Student student : students) {
            student.displayDetails();
            System.out.println("------------------------");
        }

        sc.close();
    }
}
