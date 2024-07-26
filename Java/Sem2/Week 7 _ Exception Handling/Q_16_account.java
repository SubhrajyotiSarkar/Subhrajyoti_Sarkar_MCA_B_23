class LessBalanceException extends Exception {
    public LessBalanceException(String message) {
        super(message);
    }
}

class Account {
    private static final int MIN_BALANCE = 500;
    private int balance;

    public Account(int initialDeposit) throws LessBalanceException {
        if (initialDeposit < MIN_BALANCE) {
            throw new LessBalanceException("Initial deposit must be at least Rs " + MIN_BALANCE);
        }
        this.balance = initialDeposit;
    }

    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited Rs " + amount + ". Current Balance: Rs " + balance);
    }

    public void withdraw(int amount) throws LessBalanceException {
        if (amount > balance) {
            throw new LessBalanceException("Withdrawal amount Rs " + amount + " is not valid. Current Balance: Rs " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn Rs " + amount + ". Current Balance: Rs " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

public class Q_16_account {
    public static void main(String[] args) {
        try {
            Account account1 = new Account(1000); 
            Account account2 = new Account(1500); 

            account1.deposit(500);                  
            account1.withdraw(200); 
            account2.deposit(400);  
            account2.withdraw(2000); 
        } catch (LessBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}

