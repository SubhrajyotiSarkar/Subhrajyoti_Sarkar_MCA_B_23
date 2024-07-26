import java.util.Scanner;

public class q36_last_index_of_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        System.out.print("Enter a word: ");
        String word = sc.next();

        int index = str.lastIndexOf(word);

        System.out.println(index + 1);
        sc.close();
    }
}
