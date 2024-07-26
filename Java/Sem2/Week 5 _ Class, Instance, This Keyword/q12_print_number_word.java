import java.util.*;

class PrintNumberInWord {
    String name[] = { "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE" };
    int n;

    PrintNumberInWord(int n) {
        this.n = n;
    }

    void print() {
        System.out.println(name[n]);
    }
}

class q12_print_number_word {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter a Number");
        int n = sc.nextInt();
        PrintNumberInWord obj = new PrintNumberInWord(n);
        obj.print();
    }
}
