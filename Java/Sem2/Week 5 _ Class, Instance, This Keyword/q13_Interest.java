import java.util.*;
import java.text.*;

@SuppressWarnings("unused")

class Account {
    private int id;
    private double balance, annualInterestRate;
    private String dataCreated;
    static SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
    static Date date = new Date();

    Account() {
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        dataCreated = formatter.format(date);
    }

    Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        dataCreated = formatter.format(date);
    }

    void getMonthlyInterestRate() {
        System.out.println("Monthly Interest Rate: " + annualInterestRate / 12);
    }

    void getMonthlyInterest() {
        System.out.println("Monthly Interest: " + (balance * annualInterestRate / 12 / 100));
    }

    void withdraw(int amount) {
        balance -= amount;
        System.out.println("Amount After Withdraw: " + balance);
    }

    void deposit(int amount) {
        balance += amount;
        System.out.println("Amount After Deposit: " + balance);
    }
}

class q13_Interest {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Id: ");
        int id = sc.nextInt();
        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();
        System.out.print("Enter Annual Interest Rate: ");
        double rate = sc.nextDouble();
        Account obj = new Account(id, bal, rate);
        int amount;
        while (true) {
            System.out.println("\n1. Show Interest Rate\n2. Show Monthly Interest\n3. Withdraw\n4. Deposit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.getMonthlyInterestRate();
                    break;
                case 2:
                    obj.getMonthlyInterest();
                    break;
                case 3:
                    System.out.println("Enter Amount: ");
                    amount = sc.nextInt();
                    obj.withdraw(amount);
                    break;
                case 4:
                    System.out.println("Enter Amount: ");
                    amount = sc.nextInt();
                    obj.deposit(amount);
                    break;
            }
            int x;
            System.out.println("Edit More?\n1. Yes\n2. No\n");
            x = sc.nextInt();
            if (x == 2) {
                System.exit(0);
            }
        }
    }
}
