// 1     1
//  2   2
//   3 3
//    4

import java.util.*;

class q25_pattern {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();
        int count = 2 * n - 3;
        for (int i = 1; i <= n; i++) {
            for(int j=1;j<i;j++) {
                System.out.print(" ");
            }
            System.out.print(i);
            for (int j = 0; j < count; j++) {
                System.out.print(" ");
            }
            count -= 2;
            if (i != n) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
