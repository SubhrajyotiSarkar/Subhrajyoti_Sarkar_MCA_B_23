import java.util.*;

class q3_fibonacci_series {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int a = 0, b = 1, c;
        System.out.print("Enter Number of Terms: ");
        int num = sc.nextInt();
        if (num == 0) {
            System.out.println(":D");
        } else if (num == 1) {
            System.out.println(a);
        } else {
            System.out.print(a + " " + b);
            num -= 2;
            while (num > 0) {
                c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
                num--;
            }
        }
    }
}
