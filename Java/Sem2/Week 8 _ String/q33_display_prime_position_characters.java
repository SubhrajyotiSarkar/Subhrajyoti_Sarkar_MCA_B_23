import java.util.Scanner;

public class q33_display_prime_position_characters {

    public static boolean isPrime(int pos) {
        boolean flag = false;
        for (int i = 2; i < pos; i++) {
            if (pos % i == 0) {
                flag = true;
                break;
            }
        }
        if (flag) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        System.out.println("Characters at prime position : ");
        for (int i = 2; i < str.length(); i++) {
            if (isPrime(i))
                sb.append(str.charAt(i)).append(" ");
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
