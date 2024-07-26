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

class OctNum extends Num {
    public OctNum(int number) {
        super(number);
    }

    public void showNum() {
        System.out.println("Octal Value: " + Integer.toOctalString(number));
    }
}

public class q11_Oct_Num {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = scanner.nextInt();
        Num regularNum = new Num(num);
        OctNum octNum = new OctNum(num);
        System.out.println("Using base class Num:");
        regularNum.showNum();
        System.out.println("\nUsing derived class OctNum:");
        octNum.showNum();
        scanner.close();
    }
}
