public class q23_Illustrate_Thread_Example_for_setName {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.setName("MyThread");
        thread.start();
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Thread name: " + Thread.currentThread().getName());
        }
    }
}
