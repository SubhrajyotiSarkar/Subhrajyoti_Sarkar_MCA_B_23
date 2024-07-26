import java.util.*;

class q19_matrix_multiply {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Number of Rows for First Matrix: ");
        int n1 = sc.nextInt();
        System.out.print("Enter Number of Columns for First Matrix: ");
        int m1 = sc.nextInt();
        int ar1[][] = new int[n1][m1];
        System.out.println("Enter Matrix Elements: ");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                ar1[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter Number of Rows for Second Matrix: ");
        int n2 = sc.nextInt();
        System.out.print("Enter Number of Columns for Second Matrix: ");
        int m2 = sc.nextInt();
        if (m1 != n2) {
            System.out.println("Matrix Multiplication Not Possible");
            System.exit(0);
        }
        int ar2[][] = new int[n2][m2];
        System.out.println("Enter Matrix Elements: ");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                ar2[i][j] = sc.nextInt();
            }
        }
        int ar3[][] = new int[n1][m2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                for (int k = 0; k < n2; k++) {
                    ar3[i][j] += ar1[i][k] * ar2[k][j];
                }
            }
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(ar3[i][j] + " ");
            }
            System.out.println();
        }
    }
}
