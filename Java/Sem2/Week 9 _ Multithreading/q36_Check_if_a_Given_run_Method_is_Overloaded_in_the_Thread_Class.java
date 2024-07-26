public class q36_Check_if_a_Given_run_Method_is_Overloaded_in_the_Thread_Class {
    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.start();
    }

    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("run() method is overloaded.");
        }

        public void run(String message) {
            System.out.println("run() method is overloaded with message: " + message);
        }
    }
}
