import java.util.Scanner;

public class q12_string_equals {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        boolean areEqual = str1.equals(str2);
        System.out.println("Using equals(): " + str1 + " == " + str2 + " is " + areEqual);
        sc.close();
    }
}
