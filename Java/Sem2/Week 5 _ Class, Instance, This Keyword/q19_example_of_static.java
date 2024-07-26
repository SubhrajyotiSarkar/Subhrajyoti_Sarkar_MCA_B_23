import java.util.*;

class q19_example_of_static {
    static Scanner sc = new Scanner(System.in);

    static int count = 0;

    static void counter() {
        count++;
    }

    public static void main(String args[]) {
        System.out.println("The Counter Now Shows 0: " + count);
        counter();
        System.out.println("The Counter Now Shows 1: " + count);
    }
}
