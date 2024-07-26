import java.util.*;

class q20_m_is_multiple_of_n {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter M: ");
        int m = sc.nextInt();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        if (m % n == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
