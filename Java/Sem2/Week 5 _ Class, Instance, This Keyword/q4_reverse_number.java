import java.util.*;

class number {
    int num;

    number(int num) {
        this.num = num;
    }

    void reverse() {
        int n = 0;
        while (num > 0) {
            int r = num % 10;
            n = n * 10 + r;
            num = num / 10;
        }
        System.out.println("Reverse Number: " + n);
    }
}

class q4_reverse_number {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        number obj = new number(num);
        obj.reverse();
    }
}
