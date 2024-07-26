public class q40_Check_a_Thread_has_Stopped_or_Not {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (!thread.isAlive()) {
            System.out.println("Thread has stopped.");
        } else {
            System.out.println("Thread is still running.");
        }
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread is running...");
        }
    }
}
