import java.util.Scanner;

public class q31_largest_smallest_word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        findLargestSmallestWords(str);
        sc.close();
    }

    public static void findLargestSmallestWords(String str) {
        if (str.isEmpty()) {
            System.out.println("String is empty.");
            return;
        }

        String[] words = str.trim().split("\\s");

        if (words.length == 1) {
            System.out.println("String contains only one word: " + words[0]);
            return;
        }

        String largestWord = words[0];
        String smallestWord = words[0];

        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            } else if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
        }

        System.out.println("Largest word: " + largestWord);
        System.out.println("Smallest word: " + smallestWord);
    }
}
