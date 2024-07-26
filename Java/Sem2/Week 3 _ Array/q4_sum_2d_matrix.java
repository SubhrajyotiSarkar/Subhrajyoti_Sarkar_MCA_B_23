import java.util.*;

class q4_sum_2d_matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int m = sc.nextInt();
        int a1[][] = new int[n][m];
        int a2[][] = new int[n][m];
        System.out.println("Enter First Matrix Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter Second Matrix Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a2[i][j] = sc.nextInt();
                a1[i][j] = a1[i][j] + a2[i][j];
            }
        }
        System.out.println("Summation: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a1[i][j] + " ");
            }
            System.out.println();
        }

    }
}
