import java.util.*;

class q8_multiples_of_10 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i * 10 <= n) {
            System.out.print(i * 10 + " ");
            i++;
        }
    }
}
