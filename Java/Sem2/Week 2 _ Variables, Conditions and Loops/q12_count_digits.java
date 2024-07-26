import java.util.*;

class q12_count_digits {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int count = 0, m = n;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        System.out.println(m + " has " + count + " digits");
    }
}
