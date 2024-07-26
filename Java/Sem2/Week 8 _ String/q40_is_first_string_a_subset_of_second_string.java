import java.util.Scanner;

public class q40_is_first_string_a_subset_of_second_string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        for (int i = 0; i < str1.length(); i++) {
            char currentChar = str1.charAt(i);
            if (str2.indexOf(currentChar) == -1) {
                System.out.println("String 1 is not a subset of String 2");
                System.exit(0);
            }
        }

        System.out.println("String 1 is a subset of String 2");

        scanner.close();
    }
}
