import java.util.Scanner;

public class q25_uppercase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();

        boolean isWordStart = true;
        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (isWordStart) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    isWordStart = false;
                }
            } else {
                isWordStart = true;
            }
        }

        String modifiedString = new String(charArray);

        System.out.println("Original String: " + str);
        System.out.println("Modified String: " + modifiedString);
        sc.close();
    }
}
