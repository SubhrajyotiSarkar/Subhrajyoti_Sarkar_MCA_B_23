import java.util.*;

class q13_string_equalsIgnoreCase {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        System.out.print("Enter Another String: ");
        String t = sc.nextLine();
        if (s.equalsIgnoreCase(t)) {
            System.out.println(s + " and " + t + " are equal if we ignore the cases");
        } else {
            System.out.printf("%s and %s are not equal", s, t);
        }
    }
}
