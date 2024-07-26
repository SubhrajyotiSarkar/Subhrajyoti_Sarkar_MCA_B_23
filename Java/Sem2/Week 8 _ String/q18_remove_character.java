import java.util.Scanner;

public class q18_remove_character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        System.out.println("Enter the character : ");
        String ch = sc.next();
        String replacedString = str.replace(ch, ""); // Replace with a space

        System.out.println("Original String: " + str);
        System.out.println("String after removing " + ch + ": " + replacedString);
        sc.close();
    }
}
