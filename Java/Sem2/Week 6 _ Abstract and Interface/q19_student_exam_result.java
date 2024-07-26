import java.util.Scanner;

interface Exam {
    void conductExam();
}

class Student {
    private String name;
    private int rollNumber;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

class Result implements Exam {
    private int marks;

    public void conductExam() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks obtained: ");
        marks = sc.nextInt();
        sc.close();
    }

    public void displayResult() {
        System.out.println("Marks Obtained: " + marks);
    }
}

public class q19_student_exam_result {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNumber = sc.nextInt();
        Student student = new Student(name, rollNumber);
        System.out.println("\nConducting exam for student...");
        Result result = new Result();
        result.conductExam();
        System.out.println("\nStudent Details:");
        student.displayDetails();
        System.out.println("\nExam Result:");
        result.displayResult();

        sc.close();
    }
}
