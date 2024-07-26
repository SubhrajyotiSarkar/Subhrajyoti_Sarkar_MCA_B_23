import java.util.*;

class q10_swap_numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter a Number: ");
        int a = sc.nextInt();
        System.out.print("Enter a Number: ");
        int b = sc.nextInt();
        System.out.println("Numbers before Swapping:");
        System.out.println(a + " " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Numbers after Swapping:");
        System.out.println(a + " " + b);
    }
}
