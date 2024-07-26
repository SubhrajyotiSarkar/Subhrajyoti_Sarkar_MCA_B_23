import java.util.*;

public class q21_print_consecutive_numbers {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        String numstr = String.valueOf(number);
        int sum = 0;
        for (int i = 0; i < numstr.length() - 1; i++) {
            int currNum = (numstr.charAt(i) - '0') * 10 + (numstr.charAt(i + 1) - '0');
            System.out.print(currNum + " ");
            sum = sum + currNum;
        }
        System.out.println("\nSum of numbers formed by consecutive digits: " + sum);
    }
}