public class q20_Handle_IllegalThreadStateException {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "MyThread");
        thread.start();
        try {
            thread.start();
        } catch (IllegalThreadStateException e) {
            System.out.println("IllegalThreadStateException caught: " + e.getMessage());
        }
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running...");
        }
    }
}
