import java.util.LinkedList;
public class q6_Producer_Consumer_Problem_Using_Synchronization {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        new Thread(() -> buffer.produce()).start();
        new Thread(() -> buffer.consume()).start();
    }
}
class Buffer {
    private final LinkedList<Integer> queue = new LinkedList<>();
    private final int capacity = 5;
    public synchronized void produce() {
        try {
            for (int i = 0; i < 10; i++) {
                while (queue.size() == capacity) wait();
                queue.add(i);
                System.out.println("Produced: " + i);
                notify();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void consume() {
        try {
            for (int i = 0; i < 10; i++) {
                while (queue.isEmpty()) wait();
                int consumed = queue.removeFirst();
                System.out.println("Consumed: " + consumed);
                notify();
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
