import java.util.*;

class q14_palindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int m = 0, c = n;
        while (c > 0) {
            int r = c % 10;
            m = m * 10 + r;
            c = c / 10;
        }
        if (m == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("NOT Palindrome");
        }
    }
}
