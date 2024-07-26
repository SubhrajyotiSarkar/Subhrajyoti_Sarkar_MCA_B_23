import java.util.Scanner;

public class q30_consecutive_vowel {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("Consecutive vowel substrings: " + findConsecutiveVowels(str));
        sc.close();
    }

    public static String findConsecutiveVowels(String str) {
        String vowels = "aeiouAEIOU";

        int startIndex = -1;
        char ch = ' ', c = ' ';
        for (int i = 0; i < str.length() - 1; i++) {
            ch = str.charAt(i);
            c = str.charAt(i + 1);
            if (vowels.indexOf(ch) != -1 && vowels.indexOf(c) != -1) {
                startIndex = i;
                break;
            }
        }

        if (startIndex == -1) {
            return "There are no Consecutive Vowels in this String";
        } else {
            return ch + " and " + c + " appear consecutively in this String";
        }
    }
}
