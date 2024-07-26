import java.util.*;

class q1_sum_average {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int ar[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            sum = sum + ar[i];
        }
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum / n);
    }
}
