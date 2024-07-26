import java.util.Scanner;

public class q23_search_a_word {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        System.out.print("Enter Word: ");
        String word = sc.next();

        int index = str.indexOf(word);

        if (index != -1) {
            System.out.println("Found at: " + index);
        } else {
            System.out.println("Not found");
        }
        sc.close();
    }
}
