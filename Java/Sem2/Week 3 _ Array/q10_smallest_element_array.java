import java.util.*;

class q10_smallest_element_array {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        int ar[] = new int[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        int min = ar[0];
        for (int i = 0; i < n; i++) {
            if (ar[i] < min) {
                min = ar[i];
            }
        }
        System.out.println("Minimum Element: " + min);
    }
}
