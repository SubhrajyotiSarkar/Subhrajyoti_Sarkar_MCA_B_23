import java.util.Scanner;

public class q9_remove_white_spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        str = str.trim();

        str = str.replaceAll("\\s", "");
        System.out.println(str);
        sc.close();
    }
}
