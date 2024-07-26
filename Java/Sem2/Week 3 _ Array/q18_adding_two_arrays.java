import java.util.*;

class q18_adding_two_arrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        System.out.println("Enter First Array Elements: ");
        int ar1[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
        }
        System.out.println("Enter Second Array Elements: ");
        int ar2[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar2[i] = sc.nextInt();
        }
        System.out.println("Summation Array Elements: ");
        int ar3[] = new int[n];
        for (int i = 0; i < n; i++) {
            ar3[i] = ar1[i] + ar2[i];
            System.out.print(ar3[i] + " ");
        }
    }
}
