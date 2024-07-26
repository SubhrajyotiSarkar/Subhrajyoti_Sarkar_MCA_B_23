import java.util.*;

class q14_prime_numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int ar[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int x = 0;
            ar[i] = sc.nextInt();
            for (int j = 1; j <= ar[i]; j++) {
                if (ar[i] % j == 0) {
                    x++;
                }
            }
            if (x == 2) {
                count++;
            }
        }
        System.out.println("Number of Prime Numbers: " + count);
    }
}
