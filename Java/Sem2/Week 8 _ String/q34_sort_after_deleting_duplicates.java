import java.util.HashSet;
import java.util.Scanner;
import java.util.Arrays;

public class q34_sort_after_deleting_duplicates {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        String sortedStr = sortUnique(str);
        System.out.println(sortedStr);
        sc.close();
    }

    public static String sortUnique(String str) {
        StringBuilder sb = new StringBuilder();
        HashSet<Character> uniqueChars = new HashSet<>();

        for (char ch : str.toCharArray()) {
            if (ch != ' ' && !uniqueChars.contains(ch)) {
                sb.append(ch);
                uniqueChars.add(ch);
            }
        }

        char[] charArray = sb.toString().toCharArray();
        Arrays.sort(charArray);

        return new String(charArray);
    }
}
