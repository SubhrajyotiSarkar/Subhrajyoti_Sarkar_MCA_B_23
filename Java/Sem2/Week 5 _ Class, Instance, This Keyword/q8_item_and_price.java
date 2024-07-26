import java.util.*;

class Item {
    int code, price;

    Item(int code, int price) {
        this.code = code;
        this.price = price;
    }

    void print() {
        System.out.format("%4d  %5d\n", code, price);
    }
}

class q8_item_and_price {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        int code[] = new int[5];
        int price[] = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Code " + (i + 1) + ": ");
            code[i] = sc.nextInt();
            System.out.print("Enter Price " + (i + 1) + ": ");
            price[i] = sc.nextInt();
        }
        System.out.println("Code  Price");
        for (int i = 0; i < 5; i++) {
            Item obj = new Item(code[i], price[i]);
            obj.print();
        }
    }
}
