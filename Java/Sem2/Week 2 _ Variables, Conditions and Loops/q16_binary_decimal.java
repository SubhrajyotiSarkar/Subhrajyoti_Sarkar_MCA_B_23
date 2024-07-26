import java.util.*;

class q16_binary_decimal {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("1. Decimal to Binary\n2. Binary to Decimal");
        int ch = sc.nextInt();
        int n, num;
        String s;
        switch (ch) {
            case 1:
                System.out.print("Enter a Number: ");
                n = sc.nextInt();
                s = "";
                while (n > 0) {
                    int r = n % 2;
                    s = r + s;
                    n = n / 2;
                }
                num = Integer.valueOf(s);
                System.out.println(num);
                break;
            case 2:
                System.out.print("Enter a Number: ");
                n = sc.nextInt();
                s = "" + n;
                int l = s.length();
                num = 0;
                int len = l - 1;
                for (int i = 0; i < l; i++) {
                    int x = Integer.parseInt("" + s.charAt(i)) ^ len;
                    num = num + x;
                }
                System.out.println(num);
                break;
        }
    }
}
