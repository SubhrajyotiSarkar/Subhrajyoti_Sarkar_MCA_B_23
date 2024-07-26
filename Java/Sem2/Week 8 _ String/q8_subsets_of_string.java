import java.util.*;

public class q8_subsets_of_string {

    public static List<String> findSubsets(String str, int k) {
        List<String> subsets = new ArrayList<>();
        generateSubsets(str, 0, k, "", subsets);
        return subsets;
    }

    private static void generateSubsets(String str, int index, int k, String current, List<String> subsets) {
        if (current.length() == k) {
            subsets.add(current);
            return;
        }

        if (index == str.length())
            return;

        generateSubsets(str, index + 1, k, current + str.charAt(index), subsets);

        generateSubsets(str, index + 1, k, current, subsets);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String input = sc.nextLine();
        System.out.print("Enter Length of Substring: ");
        int k = sc.nextInt();
        List<String> subsets = findSubsets(input, k);

        System.out.println("Subsets of length " + k + " in the string \"" + input + "\":");
        for (String subset : subsets) {
            System.out.println(subset);
        }
        sc.close();
    }
}
