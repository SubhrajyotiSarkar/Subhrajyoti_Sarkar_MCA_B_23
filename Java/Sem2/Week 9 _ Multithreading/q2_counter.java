public class q2_counter {
    static int counter = 0;
    public static void main(String[] args) {
        Thread t1 = new Thread(new MyRunnable(1));
        Thread t2 = new Thread(new MyRunnable(3));
        Thread t3 = new Thread(new MyRunnable(5));
        Thread t4 = new Thread(new MyRunnable(7));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Final count for Thread 1: " + MyRunnable.count1);
        System.out.println("Final count for Thread 2: " + MyRunnable.count2);
        System.out.println("Final count for Thread 3: " + MyRunnable.count3);
        System.out.println("Final count for Thread 4: " + MyRunnable.count4);
    }
    static class MyRunnable implements Runnable {
        static int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
        int priority;
        MyRunnable(int priority) {
            this.priority = priority;
        }
        public void run() {
            Thread.currentThread().setPriority(priority);
            for (int i = 0; i < 10; i++) {
                synchronized (this) {
                    counter++;
                    switch (priority) {
                        case 1:
                            count1++;
                            break;
                        case 3:
                            count2++;
                            break;
                        case 5:
                            count3++;
                            break;
                        case 7:
                            count4++;
                            break;
                    }
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
