import java.util.*;

public class q11_compare_strings {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter a String: ");
        String str1 = sc.next();
        System.out.print("Enter another String: ");
        String str2 = sc.next();

        // Method 1: Using equals() method
        long startTime1 = System.nanoTime();
        boolean isEqual1 = str1.equals(str2);
        long endTime1 = System.nanoTime();
        long executionTime1 = endTime1 - startTime1;

        // Method 2: Using compareTo() method
        long startTime2 = System.nanoTime();
        int comparisonResult = str1.compareTo(str2);
        boolean isEqual2 = comparisonResult == 0;
        long endTime2 = System.nanoTime();
        long executionTime2 = endTime2 - startTime2;

        // Displaying results
        System.out.println("Method 1 (equals()):");
        System.out.println("Strings are equal: " + isEqual1);
        System.out.println("Execution time: " + executionTime1 + " nanoseconds\n");

        System.out.println("Method 2 (compareTo()):");
        System.out.println("Strings are equal: " + isEqual2);
        System.out.println("Execution time: " + executionTime2 + " nanoseconds");
    }
}
