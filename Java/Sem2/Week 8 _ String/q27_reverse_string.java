import java.util.Scanner;

public class q27_reverse_string {

    public static String reverseIteration(String s) {
        String newS = "";
        for (int i = s.length() - 1; i >= 0; i--)
            newS += s.charAt(i);

        return newS;
    }

    public static String reverseRecursion(String s) {
        if (s.isEmpty()) {
            return s;
        } else {
            return reverseRecursion(s.substring(1)) + s.charAt(0);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        String strReverseIteration = reverseIteration(str);
        String strReverseRecursion = reverseRecursion(str);

        System.out.println("Iteration : " + strReverseIteration);
        System.out.println("Recursion : " + strReverseRecursion);

        sc.close();
    }
}
