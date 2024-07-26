public class q8_Show_How_Can_Class_Object_be_Locked_Using_Method_Level_Synchronization {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(new MyRunnable(), "Thread 2");
        thread1.start();
        thread2.start();
    }
}

class MyClass {
    public synchronized void synchronizedMethod() {
        System.out.println(Thread.currentThread().getName() + " is executing synchronized method.");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class MyRunnable implements Runnable {
    private static MyClass myClass = new MyClass();

    public void run() {
        myClass.synchronizedMethod();
    }
}
