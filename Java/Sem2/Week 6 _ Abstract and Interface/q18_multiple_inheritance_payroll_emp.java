import java.util.Scanner;

interface Payable {
    double calculateBasicSalary();
}

interface Taxable {
    double calculateTax();
}

class Employee implements Payable, Taxable {
    private double basicSalary;
    private double taxRate;

    public Employee(double basicSalary, double taxRate) {
        this.basicSalary = basicSalary;
        this.taxRate = taxRate;
    }

    public double calculateBasicSalary() {
        return basicSalary;
    }

    public double calculateTax() {
        return basicSalary * (taxRate / 100);
    }
}

public class q18_multiple_inheritance_payroll_emp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the employee's basic salary: ");
        double basicSalary = scanner.nextDouble();
        System.out.print("Enter the tax rate (in percentage): ");
        double taxRate = scanner.nextDouble();
        Employee employee = new Employee(basicSalary, taxRate);
        System.out.println("Basic Salary: $" + employee.calculateBasicSalary());
        System.out.println("Tax Amount: $" + employee.calculateTax());
        scanner.close();
    }
}