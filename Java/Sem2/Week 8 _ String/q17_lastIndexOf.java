import java.util.Scanner;

public class q17_lastIndexOf {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter string : ");
        String str = sc.nextLine();
        System.out.println("Enter sub string : ");
        String subStr = sc.next();

        int x = str.lastIndexOf(subStr);
        if (x == -1) {
            System.out.printf("%s is not in %s\n", subStr, str);
        } else {
            System.out.printf("Last Index of %s in %s is: %d\n", subStr, str, x);
        }

        sc.close();
    }
}
