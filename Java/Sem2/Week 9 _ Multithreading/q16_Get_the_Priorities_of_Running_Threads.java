public class q16_Get_the_Priorities_of_Running_Threads {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        thread1.start();
        thread2.start();
        int priority1 = thread1.getPriority();
        int priority2 = thread2.getPriority();
        System.out.println(thread1.getName() + " priority: " + priority1);
        System.out.println(thread2.getName() + " priority: " + priority2);
    }
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println(Thread.currentThread().getName() + " is running with priority: " + Thread.currentThread().getPriority());
        }
    }
}
