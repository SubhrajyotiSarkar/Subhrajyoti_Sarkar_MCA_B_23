import java.util.Scanner;

public class q21_search_word {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();

        System.out.println("Enter the word : ");
        String word = sc.next();

        int index = str.indexOf(word);

        if (index != -1)
            System.out.println("Found at " + index);
        else
            System.out.println("Not found");

        sc.close();
    }
}
