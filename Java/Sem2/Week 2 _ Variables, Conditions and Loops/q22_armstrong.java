import java.util.*;

class q22_armstrong {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        String s = "" + n;
        int l = s.length();
        int sum = 0, m = n;
        while (m > 0) {
            int r = m % 10;
            sum = sum + (int) Math.pow(r, l);
            m = m / 10;
        }
        if (n == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
