import java.util.Scanner;

public class q24_replace_all_occurings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter word to replace: ");
        String word = sc.next();
        System.out.print("Enter word you want to replace to: ");
        String newWord = sc.next();

        String newStr = str.replace(word, newWord);

        System.out.println(str);
        System.out.println(newStr);
        sc.close();
    }
}
