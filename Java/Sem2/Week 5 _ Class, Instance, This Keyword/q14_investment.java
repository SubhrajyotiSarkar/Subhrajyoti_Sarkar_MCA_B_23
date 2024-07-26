import java.util.*;

class Investment {
    int principal, amount, rate;

    Investment(int principal, int rate) {
        this.principal = principal;
        this.rate = rate;
        this.amount = 0;
    }

    void print() {
        for (int i = 1; i <= 30; i++) {
            amount = principal * rate * i / 100;
            System.out.format("%2d  %14d\n", i, amount);
        }
    }
}

class q14_investment {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Principal: ");
        int principal = sc.nextInt();
        System.out.print("Enter Yearly Rate: ");
        int rate = sc.nextInt();
        Investment obj = new Investment(principal, rate);
        System.out.println("Year  Future Value");
        obj.print();
    }
}
