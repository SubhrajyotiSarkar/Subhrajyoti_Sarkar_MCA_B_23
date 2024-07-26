import java.util.*;

class q1_buzz_number {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        if (num % 10 == 7 || num % 7 == 0) {
            System.out.println(num + " is a Buzz Number");
        } else {
            System.out.println(num + " is not a Buzz Number");
        }
    }
}
