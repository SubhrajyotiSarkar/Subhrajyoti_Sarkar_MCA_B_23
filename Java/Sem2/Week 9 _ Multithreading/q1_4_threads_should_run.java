public class q1_4_threads_should_run {
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(), "Thread 1");
        Thread t2 = new Thread(new MyRunnable(), "Thread 2");
        Thread t3 = new Thread(new MyRunnable(), "Thread 3");
        Thread t4 = new Thread(new MyRunnable(), "Thread 4");
        t1.setPriority(Thread.MIN_PRIORITY); // Priority 1
        t2.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t3.setPriority(Thread.NORM_PRIORITY); // Priority 5
        t4.setPriority(Thread.MAX_PRIORITY); // Priority 10
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running with priority: "
                    + Thread.currentThread().getPriority());
        }
    }
}
