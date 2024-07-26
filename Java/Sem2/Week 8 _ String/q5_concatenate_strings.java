import java.util.Scanner;

public class q5_concatenate_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two strings : ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);

        System.out.println(sb.toString());
        sc.close();
    }
}
