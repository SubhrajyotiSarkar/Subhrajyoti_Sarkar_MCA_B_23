import java.util.Scanner;
import java.util.HashMap;

public class q42_frequency_of_characters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        inputString = inputString.toLowerCase();

        System.out.println("Occurrences of each character (ignoring case):");
        HashMap<Character, Integer> hm = new HashMap<>();

        for (char c : inputString.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }

        System.out.println(hm);

        sc.close();
    }
}
