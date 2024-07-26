import java.util.Scanner;

public class q32_first_last_occurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        System.out.println("Enter the character : ");
        String ch = sc.next();

        int firstIndex = str.indexOf(ch);
        int lastIndex = str.lastIndexOf(ch);

        System.out.println("First index : " + firstIndex + ", " + "Last index : " + lastIndex);
        sc.close();
    }
}
