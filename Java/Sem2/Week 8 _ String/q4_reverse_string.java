import java.util.Scanner;

public class q4_reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter a string : ");
        String str = sc.nextLine();
        String revStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            revStr += str.charAt(i);
        }

        System.out.println(revStr);
        sc.close();
    }
}
