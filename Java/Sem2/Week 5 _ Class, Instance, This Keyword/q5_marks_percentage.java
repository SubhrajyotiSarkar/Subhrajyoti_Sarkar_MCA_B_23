import java.util.*;

class Student {
    String name;
    int roll;
    int sub1;
    int sub2;

    Student(String name, int roll, int sub1, int sub2) {
        this.name = name;
        this.roll = roll;
        this.sub1 = sub1;
        this.sub2 = sub2;
    }

    void calculate() {
        System.out.println("Total Marks: " + (sub1 + sub2));
        System.out.println("Percentage: " + (sub1 + sub2) * 100 / 200);
    }
}

class q5_marks_percentage {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();
        System.out.print("Enter Marks of First Subject: ");
        int sub1 = sc.nextInt();
        System.out.print("Enter Marks of Second Subject: ");
        int sub2 = sc.nextInt();

        Student obj = new Student(name, roll, sub1, sub2);
        obj.calculate();
    }
}
