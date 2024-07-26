// 1
// 2 3 4
// 5 6 7 8 9

import java.util.*;

class q23_pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
