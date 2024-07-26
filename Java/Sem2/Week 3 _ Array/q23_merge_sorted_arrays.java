import java.util.Scanner;

public class q23_merge_sorted_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the first array (ar1): ");
        int n = sc.nextInt();

        int[] ar1 = new int[n];
        System.out.println("Enter the elements of the first array (ar1) in ascending order:");
        for (int i = 0; i < n; i++) {
            ar1[i] = sc.nextInt();
        }

        System.out.print("Enter the size of the second array (ar2): ");
        int m = sc.nextInt();

        int[] ar2 = new int[m];
        System.out.println("Enter the elements of the second array (ar2) in ascending order:");
        for (int i = 0; i < m; i++) {
            ar2[i] = sc.nextInt();
        }

        int[] ar3 = mergeArrays(ar1, ar2);

        System.out.println("Merged array (ar3):");
        for (int num : ar3) {
            System.out.print(num + " ");
        }
        sc.close();
    }

    public static int[] mergeArrays(int[] ar1, int[] ar2) {
        int n = ar1.length;
        int m = ar2.length;
        int[] ar3 = new int[n + m];

        int i = 0, j = 0, k = 0;
        while (i < n && j < m) {
            if (ar1[i] < ar2[j]) {
                ar3[k++] = ar1[i++];
            } else {
                ar3[k++] = ar2[j++];
            }
        }

        while (i < n) {
            ar3[k++] = ar1[i++];
        }

        while (j < m) {
            ar3[k++] = ar2[j++];
        }

        return ar3;
    }
}
