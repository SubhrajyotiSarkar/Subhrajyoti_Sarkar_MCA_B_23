import java.util.Scanner;

abstract class Asset {
    protected String descriptor;
    protected String date;
    protected double currentValue;

    public abstract void displayDetails();
}

class Stock extends Asset {
    private int numShares;
    private double sharePrice;

    public Stock(String descriptor, String date, double currentValue, int numShares, double sharePrice) {
        this.descriptor = descriptor;
        this.date = date;
        this.currentValue = currentValue;
        this.numShares = numShares;
        this.sharePrice = sharePrice;
    }

    public void displayDetails() {
        System.out.println("Stock Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Number of Shares: " + numShares);
        System.out.println("Share Price: " + sharePrice);
    }
}

class Bond extends Asset {
    private double interestRate;

    public Bond(String descriptor, String date, double currentValue, double interestRate) {
        this.descriptor = descriptor;
        this.date = date;
        this.currentValue = currentValue;
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Bond Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interestRate);
    }
}

class Savings extends Asset {
    private double interestRate;

    public Savings(String descriptor, String date, double currentValue, double interestRate) {
        this.descriptor = descriptor;
        this.date = date;
        this.currentValue = currentValue;
        this.interestRate = interestRate;
    }

    public void displayDetails() {
        System.out.println("Savings Details:");
        System.out.println("Descriptor: " + descriptor);
        System.out.println("Date: " + date);
        System.out.println("Current Value: " + currentValue);
        System.out.println("Interest Rate: " + interestRate);
    }
}

public class q10_asset_stock_bond_saving {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter stock details:");
        System.out.print("Descriptor: ");
        String stockDescriptor = sc.nextLine();
        System.out.print("Date: ");
        String stockDate = sc.nextLine();
        System.out.print("Current Value: ");
        double stockValue = sc.nextDouble();
        System.out.print("Number of Shares: ");
        int numShares = sc.nextInt();
        System.out.print("Share Price: ");
        double sharePrice = sc.nextDouble();

        Stock stock = new Stock(stockDescriptor, stockDate, stockValue, numShares, sharePrice);

        System.out.println("\nEnter bond details:");
        System.out.print("Descriptor: ");
        sc.nextLine(); // Consume newline character
        String bondDescriptor = sc.nextLine();
        System.out.print("Date: ");
        String bondDate = sc.nextLine();
        System.out.print("Current Value: ");
        double bondValue = sc.nextDouble();
        System.out.print("Interest Rate: ");
        double interestRate = sc.nextDouble();

        Bond bond = new Bond(bondDescriptor, bondDate, bondValue, interestRate);

        System.out.println("\nEnter savings details:");
        System.out.print("Descriptor: ");
        sc.nextLine(); // Consume newline character
        String savingsDescriptor = sc.nextLine();
        System.out.print("Date: ");
        String savingsDate = sc.nextLine();
        System.out.print("Current Value: ");
        double savingsValue = sc.nextDouble();
        System.out.print("Interest Rate: ");
        double savingsInterestRate = sc.nextDouble();

        Savings savings = new Savings(savingsDescriptor, savingsDate, savingsValue, savingsInterestRate);

        System.out.println("\nDisplaying Details:");
        stock.displayDetails();
        bond.displayDetails();
        savings.displayDetails();

        sc.close();
    }
}
