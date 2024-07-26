import java.util.*;

class example {
    int data;

    example(int data) {
        this.data = data;
    }

    void print() {
        System.out.println("The Data is: " + data);
    }
}

class q18_example_of_this {
    static Scanner sc = new Scanner(System.in);

    public static void main(String args[]) {
        System.out.print("Enter Data: ");
        int n = sc.nextInt();
        example obj = new example(n);
        obj.print();
    }
}
