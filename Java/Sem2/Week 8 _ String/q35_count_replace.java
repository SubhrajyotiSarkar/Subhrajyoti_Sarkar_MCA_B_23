import java.util.*;

class q35_count_replace {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter String: ");
        String s = sc.nextLine();
        HashMap<Character, Integer> hmap = new HashMap<>();
        for (char c : s.toCharArray()) {
            hmap.put(c, hmap.getOrDefault(c, 0) + 1);
        }
        for (char c : hmap.keySet()) {
            int x = s.indexOf(c);
            s = s.substring(0, x) + hmap.get(c) + s.substring(x + 1);
        }
        System.out.println(s);
    }
}
