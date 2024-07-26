import java.util.Scanner;

public class q14_compareTo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Two Strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        int result1 = str1.compareTo(str2);
        int result2 = str2.compareTo(str1);

        System.out.println("str1.compareTo(str2): " + result1);
        System.out.println("str2.compareTo(str1): " + result2);
        sc.close();
    }
}
