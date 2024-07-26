import java.util.*;

class q2_factorial_of_12 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int p = 1;
        for (int i = 1; i <= 12; i++) {
            p = p * i;
        }
        System.out.println("Factorial of 12 is: " + p);
    }
}
