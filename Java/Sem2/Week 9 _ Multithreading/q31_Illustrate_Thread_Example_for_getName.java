public class q31_Illustrate_Thread_Example_for_getName {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable(), "MyThread");
        System.out.println("Thread name: " + thread.getName());
    }

    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            System.out.println("Thread is running...");
        }
    }
}
