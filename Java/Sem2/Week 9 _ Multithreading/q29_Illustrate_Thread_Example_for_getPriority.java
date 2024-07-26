public class q29_Illustrate_Thread_Example_for_getPriority {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        int priority = thread.getPriority();
        System.out.println("Thread priority: " + priority);
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread is running...");
        }
    }
}
