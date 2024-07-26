import java.util.*;

class q12_transpose_matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int m = sc.nextInt();
        int ar[][] = new int[n][m];
        System.out.println("Enter Matrix Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        System.out.println("Transpose of Matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ar[j][i] + " ");
            }
            System.out.println();
        }
    }
}
