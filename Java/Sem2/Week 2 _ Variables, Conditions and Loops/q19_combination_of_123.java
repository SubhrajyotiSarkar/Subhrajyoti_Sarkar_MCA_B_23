import java.util.*;

class q19_combination_of_123 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 3; k++) {
                    System.out.print(i + "" + j + "" + k + " ");
                }
            }
        }
    }
}
