import java.util.Scanner;

// Base class Num
class Num {
    protected int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

// Derived class HexNum
class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Hexadecimal Value: " + Integer.toHexString(number));
    }
}

// Derived class OctNum
class OctNum extends Num {
    public OctNum(int number) {
        super(number);
    }

    @Override
    public void showNum() {
        System.out.println("Octal Value: " + Integer.toOctalString(number));
    }
}

public class q12_hexnum_octnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for number
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();

        // Creating objects
        Num num = new Num(number);
        HexNum hexNum = new HexNum(number);
        OctNum octNum = new OctNum(number);

        // Displaying numbers
        System.out.println("\nDisplaying number using Num:");
        num.showNum();
        System.out.println("\nDisplaying number using HexNum:");
        hexNum.showNum();
        System.out.println("\nDisplaying number using OctNum:");
        octNum.showNum();

        scanner.close();
    }
}
