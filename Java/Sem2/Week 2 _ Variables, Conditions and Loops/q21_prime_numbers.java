import java.util.*;

class q21_prime_numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Lower Limit: ");
        int low = sc.nextInt();
        System.out.print("Enter Higher Limit: ");
        int high = sc.nextInt();
        for (int i = low + 1; i < high; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.print(i + " ");
            }
        }
    }
}
