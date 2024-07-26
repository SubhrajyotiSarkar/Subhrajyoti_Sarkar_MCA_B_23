import java.util.Scanner;

public class q3_merge_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two strings : ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        String merged = str1 + str2;

        System.out.println(merged);
        sc.close();
    }
}
