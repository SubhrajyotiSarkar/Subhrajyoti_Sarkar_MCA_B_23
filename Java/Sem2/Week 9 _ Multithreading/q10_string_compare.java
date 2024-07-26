public class q10_string_compare {
    private int balance = 10000;

    public void deposit(int amount) {
        synchronized (this) {
            balance += amount;
        }
    }

    public void withdraw(int amount) {
        synchronized (this) {
            balance -= amount;
        }
    }

    public int getBalance() {
        return balance;
    }

    public void transfer(q10_string_compare target, int amount) {
        if (this == target) {
            System.out.println("Cannot transfer to the same account.");
            return;
        }
        q10_string_compare first = this;
        q10_string_compare second = target;
        if (System.identityHashCode(this) > System.identityHashCode(target)) {
            first = target;
            second = this;
        }
        synchronized (first) {
            synchronized (second) {
                if (amount > balance) {
                    System.out.println("Insufficient funds for transfer.");
                    return;
                }
                this.withdraw(amount);
                target.deposit(amount);
            }
        }
    }
}
