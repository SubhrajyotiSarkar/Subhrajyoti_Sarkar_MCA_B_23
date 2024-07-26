import java.util.*;

class q9_maximum_of_3_numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter A Number: ");
        int a = sc.nextInt();
        System.out.print("Enter A Number: ");
        int b = sc.nextInt();
        System.out.print("Enter A Number: ");
        int c = sc.nextInt();
        int x = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println(x + " is the Largest Number");
    }
}
