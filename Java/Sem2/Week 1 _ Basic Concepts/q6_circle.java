import java.util.*;

class q6_circle {
    static double pi = 3.14;
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Radius: ");
        float r = sc.nextFloat();
        System.out.printf("Aera: %.2f", pi * r * r);
        System.out.printf("\nPerimeter: %.2f", 2*pi*r);
    }
}
