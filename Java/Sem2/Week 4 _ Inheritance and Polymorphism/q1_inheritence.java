import java.util.*;

class Employee {
  float salary;

  public void setSalary(float salary) {
    this.salary = salary;
  }

  public float getSalary() {
    return salary;
  }
}

class Programmer extends Employee {
  int bonus;

  public void setBonus(int bonus) {
    this.bonus = bonus;
  }

  public int getBonus() {
    return bonus;
  }
}

public class q1_inheritence {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Programmer p = new Programmer();
    System.out.print("Enter salary of the programmer: ");
    float salary = scanner.nextFloat();
    p.setSalary(salary);
    System.out.print("Enter bonus of the programmer: ");
    int bonus = scanner.nextInt();
    p.setBonus(bonus);
    System.out.println("Programmer salary is: " + p.getSalary());
    System.out.println("Bonus of Programmer is: " + p.getBonus());
    scanner.close();
  }
}
