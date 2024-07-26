import java.util.*;

class q18_euler {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Number of Terms: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            double p = 1;
            for (int j = 1; j <= i; j++) {
                p = p * j;
            }
            sum = sum + 1 / p;
        }
        System.out.println("Euler Sum: " + sum);
    }
}
