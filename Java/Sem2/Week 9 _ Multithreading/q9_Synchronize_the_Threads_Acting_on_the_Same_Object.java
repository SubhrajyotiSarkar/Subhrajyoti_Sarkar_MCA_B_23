public class q9_Synchronize_the_Threads_Acting_on_the_Same_Object {
    public static void main(String[] args) {
        SharedObject sharedObject = new SharedObject();
        Thread thread1 = new Thread(new MyRunnable(sharedObject), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(sharedObject), "Thread 2");
        thread1.start();
        thread2.start();
    }
}

class SharedObject {
    public void synchronizedMethod() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName() + " is executing synchronized method.");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class MyRunnable implements Runnable {
    private SharedObject sharedObject;

    public MyRunnable(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }

    public void run() {
        sharedObject.synchronizedMethod();
    }
}
