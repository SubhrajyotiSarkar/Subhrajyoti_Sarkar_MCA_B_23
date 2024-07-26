import java.util.*;

class q7_sum_of_natural_numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of First " + n + " Natual Numbers is: " + sum);
    }
}
