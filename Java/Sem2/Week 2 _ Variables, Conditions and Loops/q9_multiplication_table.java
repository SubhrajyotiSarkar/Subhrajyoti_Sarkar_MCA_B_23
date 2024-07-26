import java.util.*;

class q9_multiplication_table {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(n + " * " + i + " = " + n * i);
            i++;
        }
    }
}
