import java.util.HashSet;
import java.util.Scanner;

public class q26_delete_duplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();

        String[] words = str.split("\\s");

        HashSet<String> uniqueWords = new HashSet<>();
        StringBuilder modifiedString = new StringBuilder();

        for (String word : words) {
            if (!uniqueWords.contains(word)) {
                uniqueWords.add(word);
                modifiedString.append(word + " ");
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("String after removing duplicates: " + modifiedString.toString().trim());
        sc.close();
    }
}
