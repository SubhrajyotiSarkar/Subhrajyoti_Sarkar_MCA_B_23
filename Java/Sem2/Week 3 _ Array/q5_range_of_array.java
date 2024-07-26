import java.util.*;

class q5_range_of_array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Elements: ");
        int ar[] = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
            max = Math.max(ar[i], max);
            min = Math.min(ar[i], min);
        }
        System.out.println("This Array ranges from " + min + " to " + max);
    }
}
