import java.util.Scanner;

public class q1_factorial {

    public static int calculateFactorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Number : ");
        int number = scanner.nextInt();

        int fact = calculateFactorial(number);
        System.out.printf("Factorial of %d is: %d", number, fact);

        scanner.close();
    }
}
