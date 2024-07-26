import java.util.Scanner;

public class q7_sum_even_array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int s = 0;
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            if (ar[i] % 2 == 0)
                s = s + ar[i];
        }
        System.out.println("The Sum of Even Numbers is " + s);
    }
}
