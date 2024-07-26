class MyThread extends Thread {
    private boolean suspended = false;

    public void suspendThread() {
        suspended = true;
    }

    public void resumeThread() {
        suspended = false;
        synchronized (this) {
            notify();
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                while (suspended) {
                    synchronized (this) {
                        wait();
                    }
                }
                System.out.println("Thread is running...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                Thread.currentThread().interrupt();
            }
        }
    }

}

public class q25_Illustrate_Thread_Example_for_suspend {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        try {
            Thread.sleep(5000);

            thread.suspendThread();
            System.out.println("Thread suspended for 3 seconds...");
            Thread.sleep(3000);

            thread.resumeThread();
            System.out.println("Thread resumed...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}