import java.util.*;
import java.time.*;

class q15_commission {
    static Scanner sc = new Scanner(System.in);

    static void commission(int amount, int rate) {
        System.out.println("Commission: " + (amount * rate / 100));
    }

    static void display_Month(int y, int m) {
        YearMonth ym = YearMonth.of(y, m);
        System.out.println("\n---------------------------");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        System.out.println("---------------------------");
        int cou = 1;
        int day = LocalDate.of(y, m, 1).getDayOfWeek().getValue();
        if (day != 7)
            for (int i = 0; i < day; i++, cou++) {
                System.out.printf("%-4s", "");
            }

        for (int i = 1; i <= ym.getMonth().length(ym.isLeapYear()); i++, cou++) {
            System.out.printf("%-4d", i);
            if (cou % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n---------------------------");
    }

    static void root(int n) {
        System.out.println("Square Root of " + n + ": " + Math.sqrt(n));
    }

    static void even(int n) {
        if (n % 2 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    static void print(int n, String s) {
        while (n > 0) {
            System.out.println(s);
            n--;
        }
    }

    static void loan(double amount, double rate, int time) {
        rate = rate / 12 / 100;
        time = time * 12;
        double monthly = amount * rate * Math.pow((1 + rate), time) / (Math.pow((1 + rate), time) - 1);
        System.out.println("Monthly Payment: " + monthly);
    }

    public static void main(String args[]) {
        System.out.println(
                "1. Commission\n2. Calendar\n3. Square Root\n4. Even Check\n5. Message Spam\n6. Monthly Payment");
        System.out.println("Enter Choice: ");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.print("Enter Amount: ");
                int amount = sc.nextInt();
                System.out.print("Enter Rate: ");
                int rate = sc.nextInt();
                commission(amount, rate);
                break;
            case 2:
                System.out.print("Enter Month between 1 and 12 : ");
                int m = sc.nextInt();
                System.out.print("Enter a Full Year : ");
                int y = sc.nextInt();
                display_Month(y, m);
                break;
            case 3:
                System.out.println("Enter Number: ");
                int n = sc.nextInt();
                root(n);
                break;
            case 4:
                System.out.print("Enter Number: ");
                n = sc.nextInt();
                even(n);
                break;
            case 5:
                System.out.print("Enter Number: ");
                n = sc.nextInt();
                System.out.print("Enter Message: ");
                String s = sc.next();
                print(n, s);
                break;
            case 6:
                System.out.print("Enter Loan Amount: ");
                double amt = sc.nextDouble();
                System.out.print("Enter Rate: ");
                double r = sc.nextDouble();
                System.out.print("Enter Time: ");
                int time = sc.nextInt();
                loan(amt, r, time);
                break;
        }
    }
}
