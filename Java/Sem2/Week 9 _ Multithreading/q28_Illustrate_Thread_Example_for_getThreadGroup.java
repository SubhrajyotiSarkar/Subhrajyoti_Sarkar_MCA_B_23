public class q28_Illustrate_Thread_Example_for_getThreadGroup {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        System.out.println("Thread group: " + thread.getThreadGroup().getName());
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread is running...");
        }
    }
}
