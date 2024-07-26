import java.util.Scanner;

abstract class Accounts {
    protected double balance;
    protected int accountNumber;
    protected String accountHolderName;
    protected String address;

    public Accounts(int accountNumber, String accountHolderName, String address) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.address = address;
        this.balance = 0; // Initial balance is zero
    }

    public abstract void withdrawal(double amount);

    public abstract void deposit(double amount);

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder's Name: " + accountHolderName);
        System.out.println("Address: " + address);
        System.out.println("Current Balance: " + balance);
    }
}

class SavingsAccount extends Accounts {
    private double rateOfInterest;

    public SavingsAccount(int accountNumber, String accountHolderName, String address, double rateOfInterest) {
        super(accountNumber, accountHolderName, address);
        this.rateOfInterest = rateOfInterest;
    }

    public void calculateAmount() {
        double interest = balance * (rateOfInterest / 100);
        balance += interest;
    }

    @Override
    public void withdrawal(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }
}

public class q8_account_savingsAccount {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter account holder's name:");
        String accountHolderName = scanner.nextLine();
        System.out.println("Enter address:");
        String address = scanner.nextLine();
        System.out.println("Enter rate of interest:");
        double rateOfInterest = scanner.nextDouble();

        SavingsAccount savingsAccount = new SavingsAccount(accountNumber, accountHolderName, address, rateOfInterest);

        System.out.println("Choose an option:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Display account details");
        System.out.println("4. Exit");

        while (true) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            double amount;
            switch (choice) {
                case 1:
                    System.out.println("Enter amount to deposit:");
                    amount = scanner.nextDouble();
                    savingsAccount.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                    amount = scanner.nextDouble();
                    savingsAccount.withdrawal(amount);
                    break;
                case 3:
                    savingsAccount.display();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
