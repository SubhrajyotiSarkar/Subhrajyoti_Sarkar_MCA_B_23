import java.util.*;

class q17_merge_float_arrays {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter Number of Elements for First Array: ");
        int n = sc.nextInt();
        float ar[] = new float[n];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextFloat();
        }

        System.out.println("Enter Number of Elements for Second Array: ");
        int m = sc.nextInt();
        float arr[] = new float[m];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextFloat();
        }

        float a[] = new float[n + m];
        for (int i = 0; i < n; i++) {
            a[i] = ar[i];
        }
        for (int i = 0; i < m; i++) {
            a[n + i] = arr[i];
        }
        System.out.println("Merged Array: ");
        for (float i : a) {
            System.out.print(i + " ");
        }
    }
}
