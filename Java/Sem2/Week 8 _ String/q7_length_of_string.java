import java.util.Scanner;

public class q7_length_of_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string : ");
        String str = sc.nextLine();

        System.out.println("Length is " + str.length());
        sc.close();
    }
}
