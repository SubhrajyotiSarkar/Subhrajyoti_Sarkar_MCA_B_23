import java.util.Scanner;

public class q8_sum_diagonal_elements_2darray {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int s1 = 0, s2 = 0;
        System.out.print("Enter Matrix Size: ");
        int n = sc.nextInt();
        System.out.println("Enter Matrix Elements: ");
        int ar[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                ar[i][j] = sc.nextInt();
                if (i == j) {
                    s1 += ar[i][j];
                }
                if ((i + j) == (n - 1)) {
                    s2 += ar[i][j];
                }
            }
        }
        System.out.println("Left Diagonal Sum: " + s1);
        System.out.println("Right Diagonal Sum: " + s2);
    }
}
