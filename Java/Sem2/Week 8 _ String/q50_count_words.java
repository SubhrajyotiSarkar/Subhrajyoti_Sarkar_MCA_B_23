import java.util.Scanner;

public class q50_count_words {

    public static int wordCount(String s) {
        String[] words = s.trim().split("\\s");

        return words.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a text : ");
        String text = sc.nextLine();

        int count = wordCount(text);

        System.out.printf("Number of word(s) in the string : %d\n", count);

        sc.close();
    }
}
