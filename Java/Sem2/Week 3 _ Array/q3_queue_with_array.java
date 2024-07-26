import java.util.Scanner;

public class q3_queue_with_array {
    private static final int MAX = 10;
    private static int[] queue = new int[MAX];
    private static int front = -1, rear = -1;

    public static void enqueue(int element) {
        if (rear == MAX - 1) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            queue[rear] = element;
            System.out.println(element + " has been enqueued.");
        }
    }

    public static void dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            System.out.println(queue[front] + " has been dequeued.");
            if (front == rear) {
                front = rear = -1;
            } else {
                front++;
            }
        }
    }

    public static int peek() {
        if (front == -1) {
            System.out.println("Queue is empty. No front element to peek.");
            return -1;  // Return an error value
        } else {
            return queue[front];
        }
    }

    public static void display() {
        if (front == -1) {
            System.out.println("Queue is empty.");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, element;
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    element = sc.nextInt();
                    enqueue(element);
                    break;
                case 2:
                    dequeue();
                    break;
                case 3:
                    element = peek();
                    if (element != -1) {
                        System.out.println("Front element: " + element);
                    }
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    sc.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
