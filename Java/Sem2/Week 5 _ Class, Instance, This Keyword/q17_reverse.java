import java.util.*;

class q17_reverse {
    static Scanner sc = new Scanner(System.in);

    static int count = 0;

    static void print(int n) {
        if (count == 10) {
            return;
        } else {
            count++;
            System.out.print("Enter a Number: ");
            int num = sc.nextInt();
            print(num);
            System.out.print(num + " ");
        }
    }

    public static void main(String args[]) {
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        print(n);
    }
}
