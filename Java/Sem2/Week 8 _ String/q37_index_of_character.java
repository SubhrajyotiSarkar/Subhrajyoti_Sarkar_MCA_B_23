import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class q37_index_of_character {

    public static List<Integer> findAllIndices(String text, String searchValue) {
        List<Integer> indices = new ArrayList<>();
        int startIndex = 0;
        while (true) {
            int index = text.indexOf(searchValue, startIndex);
            if (index == -1) {
                break;
            }
            indices.add(index);
            startIndex = index + 1; // Start searching from next character
        }

        // Convert List to int array (optional)
        return indices;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
        System.out.println("Enter the character : ");
        String ch = sc.next();
        List<Integer> indices = findAllIndices(str, ch);

        for (int index : indices) {
            System.out.print(index + " ");
        }
        sc.close();
    }
}