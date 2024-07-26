import java.util.Scanner;
interface Exam {
    double percent_cal(double marks1, double marks2);
}
class Student {
    String name;
    int rollNo;
    double marks1;
    double marks2;

    public Student(String name, int rollNo, double marks1, double marks2) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks1 = marks1;
        this.marks2 = marks2;
    }

    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks 1: " + marks1);
        System.out.println("Marks 2: " + marks2);
    }
}
class Result extends Student implements Exam {
    public Result(String name, int rollNo, double marks1, double marks2) {
        super(name, rollNo, marks1, marks2);
    }

    @Override
    public double percent_cal(double marks1, double marks2) {
        return ((marks1 + marks2) / 200) * 100;
    }

    public void display() {
        super.show();
        double percentage = percent_cal(marks1, marks2);
        System.out.println("Percentage: " + percentage + "%");
    }
}

public class q16_stu_exm_res {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter student roll number:");
        int rollNo = sc.nextInt();

        System.out.println("Enter marks for subject 1:");
        double marks1 = sc.nextDouble();

        System.out.println("Enter marks for subject 2:");
        double marks2 = sc.nextDouble();

        Result result = new Result(name, rollNo, marks1, marks2);
        System.out.println("\nStudent Details:");
        result.display();

        sc.close();
    }
}
