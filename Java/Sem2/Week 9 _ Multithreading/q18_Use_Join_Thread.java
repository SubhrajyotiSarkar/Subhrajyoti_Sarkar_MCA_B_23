public class q18_Use_Join_Thread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        thread1.start();
        try {
            thread1.join(); 
            System.out.println("Thread 1 has finished.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running...");
            try {
                Thread.sleep(2000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " finished.");
        }
    }
}
