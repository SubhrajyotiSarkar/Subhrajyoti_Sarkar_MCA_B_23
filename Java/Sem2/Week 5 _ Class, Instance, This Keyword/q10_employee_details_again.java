import java.util.*;

class Employee {
    int id, basicSalary;
    String name;

    Employee(int id, String name, int basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    void print() {
        System.out.format("%10s  %5d  %12d\n", name, id, basicSalary);
    }
}

class q10_employee_details_again {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        String name[] = new String[5];
        int id[] = new int[5];
        int basicSalary[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Employee Name: ");
            name[i] = sc.next();
            System.out.print("Enter Employee Id: ");
            id[i] = sc.nextInt();
            System.out.print("Enter Employee Basic Salary: ");
            basicSalary[i] = sc.nextInt();
        }
        System.out.println("  Employee     Id  Basic Salary");
        for (int i = 0; i < 5; i++) {
            Employee obj = new Employee(id[i], name[i], basicSalary[i]);
            obj.print();
        }
    }
}
