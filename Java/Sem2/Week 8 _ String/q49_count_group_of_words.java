import java.util.Scanner;

public class q49_count_group_of_words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String input = scanner.nextLine();
        System.out.print("Enter group of words you want to count: ");
        String group = scanner.nextLine();
        int start = input.indexOf(group);
        int count = 0;
        while (start != -1) {
            count++;
            input = input.substring(start + 1);
            start = input.indexOf(group);
        }
        System.out.println("This group of words has appeared " + count + " times in input string");
        scanner.close();
    }
}
