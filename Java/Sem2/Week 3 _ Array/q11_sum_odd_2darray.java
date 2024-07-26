import java.util.*;

class q11_sum_odd_2darray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int s = 0;
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        System.out.print("Enter Number of Columns: ");
        int m = sc.nextInt();
        int ar[][] = new int[n][m];
        System.out.println("Enter Matrix Elements: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ar[i][j] = sc.nextInt();
                if (ar[i][j] % 2 != 0) {
                    s = s + ar[i][j];
                }
            }
        }
        System.out.println("Sum of Odd Numbers: " + s);

    }
}
