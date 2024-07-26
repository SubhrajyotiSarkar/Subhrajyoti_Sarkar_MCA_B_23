import java.util.Scanner;

interface Bank {
    void getBankDetails();
}

interface Customer {
    void getCustomerDetails();
}

class Account implements Bank, Customer {
    private String bankName;
    private String customerName;
    private String accountNumber;

    static Scanner sc = new Scanner(System.in);

    public void getBankDetails() {
        System.out.print("Enter Bank Name: ");
        bankName = sc.nextLine();
    }

    public void getCustomerDetails() {
        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
        System.out.print("Enter Account Number: ");
        accountNumber = sc.nextLine();
    }

    public void displayDetails() {
        System.out.println("\nBank Name: " + bankName);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class q13_multiple_inheritance_bank {
    public static void main(String[] args) {
        Account account = new Account();
        account.getBankDetails();
        account.getCustomerDetails();
        account.displayDetails();
    }
}
