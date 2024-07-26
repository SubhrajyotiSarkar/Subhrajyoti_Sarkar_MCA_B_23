import java.util.Scanner;

public class q6_getChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter Index: ");
        int index = sc.nextInt();

        if (checkChar(str, index)) {
            System.out.println("The character at index " + index + " is '" + str.charAt(index) + "'");
        } else {
            System.out.println("Character does not exist at index " + index);
        }
        sc.close();
    }

    public static boolean checkChar(String str, int index) {

        if (index < 0 || index >= str.length()) {
            return false;
        }

        return true;
    }
}
