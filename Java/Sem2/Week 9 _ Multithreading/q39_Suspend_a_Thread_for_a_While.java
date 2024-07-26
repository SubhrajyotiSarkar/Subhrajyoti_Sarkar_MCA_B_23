public class q39_Suspend_a_Thread_for_a_While {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread is running...");
            try {
                Thread.sleep(2000); // Suspend the thread for 2 seconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread resumes...");
        }
    }
}
