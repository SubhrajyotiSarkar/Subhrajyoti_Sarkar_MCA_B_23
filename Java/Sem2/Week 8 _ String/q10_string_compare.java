import java.util.Scanner;

public class q10_string_compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two strings : ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        boolean areEqual = str1.equalsIgnoreCase(str2);

        System.out.println(areEqual);
        sc.close();
    }

    public void transfer(q10_string_compare acc2, int i) {
        throw new UnsupportedOperationException("Unimplemented method 'transfer'");
    }

    public String getBalance() {
        throw new UnsupportedOperationException("Unimplemented method 'getBalance'");
    }
}
