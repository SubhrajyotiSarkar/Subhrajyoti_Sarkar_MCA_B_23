import java.util.*;

class Complex {
    public static void f1() {
        System.out.println("f1 method of the Complex class is executed.");
    }
}

class Sample extends Complex {
    public static void f1() {
        System.out.println("f1 of the Sample class is executed.");
    }
}

public class q4_method_hiding {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Enter 1 to Execute f1 from Complex Class\n2. Enter 2 to Execute f1 from Sample Class:");
        int choice = scanner.nextInt();
        if (choice == 1) {
            Complex.f1();
        } else if (choice == 2) {
            Sample.f1();
        } else {
            System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
