import java.util.*;

class q5_rectangle {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Breadth: ");
        int b = sc.nextInt();
        System.out.println("Area: " + (l * b));
        System.out.println("Perimeter: " + 2 * (l + b));
    }
}
