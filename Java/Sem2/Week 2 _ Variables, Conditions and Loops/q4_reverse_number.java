import java.util.*;

class q4_reverse_number {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        System.out.println("Original Number: " + num);
        int rev = 0;
        while (num > 0) {
            int r = num % 10;
            rev = rev * 10 + r;
            num = num / 10;
        }
        System.out.println("Reversed Number: " + rev);
    }
}
