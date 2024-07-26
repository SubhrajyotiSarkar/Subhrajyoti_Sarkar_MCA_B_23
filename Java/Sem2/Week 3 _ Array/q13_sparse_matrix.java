import java.util.*;

class q13_sparse_matrix {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int count = 0;
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int m = sc.nextInt();
        int ar[][] = new int[n][m];
        System.out.println("Enter Matrix Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
                if (ar[i][j] == 0) {
                    count++;
                }
            }
        }
        if (count > (n * m - count)) {
            System.out.println("Sparse Matrix");
        } else {
            System.out.println("Not a Sparse Matrix");
        }
    }
}
