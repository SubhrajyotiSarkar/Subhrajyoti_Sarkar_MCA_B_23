import java.util.Scanner;

public class q28_convert_toUpperCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        str = str.toUpperCase();

        System.out.println(str);
        sc.close();
    }
}
