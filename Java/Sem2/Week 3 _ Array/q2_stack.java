import java.util.Scanner;

public class stack {
    private static final int MAX_SIZE = 100;
    private static int[] stack = new int[MAX_SIZE];
    private static int top = -1;

    public static void push(int value) {
        if (top == MAX_SIZE - 1) {
            System.out.println("Stack Overflow. Cannot push element.");
        } else {
            stack[++top] = value;
            System.out.println(value + " pushed into the stack.");
        }
    }

    public static void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow. Cannot pop element.");
        } else {
            System.out.println("Popped element: " + stack[top--]);
        }
    }

    public static int topElement() {
        if (top == -1) {
            System.out.println("Stack is empty.");
            return -1;
        } else {
            return stack[top];
        }
    }

    public static void display() {
        if (top == -1) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, element;

        do {
            System.out.println("\nStack Operations Menu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Get Top Element");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    element = sc.nextInt();
                    push(element);
                    break;
                case 2:
                    pop();
                    break;
                case 3:
                    element = topElement();
                    if (element != -1) {
                        System.out.println("Top element: " + element);
                    }
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 5);

        sc.close();
    }
}