import java.util.*;

public class q43_conversion_from_one_string_to_another {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two strings : ");
        String src = sc.nextLine();
        String dest = sc.nextLine();
        src=src.toLowerCase();
        dest=dest.toLowerCase();

        int[] arr = new int[26];

        for (int i = 0; i < src.length(); i++) {
            arr[src.charAt(i) - 'a']--;
        }

        for (int i = 0; i < dest.length(); i++) {
            arr[dest.charAt(i) - 'a']++;
        }

        int sum = 0;
        for (int i = 0; i < 26; i++) {
            sum += Math.abs(arr[i]);
        }

        System.out.println("Characters to be changed: " + sum);

        sc.close();
    }
}