import java.util.*;

class Num {
    protected int number;

    public Num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {
    public HexNum(int number) {
        super(number);
    }

    public void showNum() {
        System.out.println("Hexadecimal Value: " + Integer.toHexString(number));
    }
}

public class q10_Hex_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        Num regularNum = new Num(num);
        HexNum hexNum = new HexNum(num);
        System.out.println("Using base class Num:");
        regularNum.showNum();
        System.out.println("\nUsing derived class HexNum:");
        hexNum.showNum();
        scanner.close();
    }
}
