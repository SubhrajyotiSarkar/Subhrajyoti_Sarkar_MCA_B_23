import java.util.*;

class q17_median {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int ar[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        Arrays.sort(ar);

        double index = 0;
        if (n % 2 == 0) {
            index = (double) (ar[n / 2 - 1] + ar[n / 2]) / 2;
        } else {
            index = ar[(n - 1) / 2];
        }
        System.out.printf("\nMedian: %.2f", index);
    }
}
