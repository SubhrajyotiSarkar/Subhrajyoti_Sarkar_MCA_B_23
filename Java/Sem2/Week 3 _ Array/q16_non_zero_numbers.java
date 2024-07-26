import java.util.*;

class q16_non_zero_numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int ar[] = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            if (ar[i] != 0) {
                count++;
            }
        }
        System.out.println("Number of Non-Zero Elements: " + count);
    }
}
