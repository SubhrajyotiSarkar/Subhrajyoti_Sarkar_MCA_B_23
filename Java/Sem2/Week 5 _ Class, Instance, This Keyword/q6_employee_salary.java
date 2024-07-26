import java.util.*;

class Employee {
    int id, basicSalary;
    double grossSalary;
    String name;

    Employee(int id, String name, int basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void find() {
        grossSalary = basicSalary * 110 / 100;
        System.out.println("Gross Salary will be: " + grossSalary);
    }
}

class q6_employee_salary {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Employee Id: ");
        int id = sc.nextInt();
        System.out.print("Enter Employee Basic Salary: ");
        int basicSalary = sc.nextInt();

        Employee obj = new Employee(id, name, basicSalary);
        obj.find();
    }
}
