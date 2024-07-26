public class q26_Illustrate_Thread_Example_for_currentThread {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        System.out.println("Current thread: " + thread.getName());
    }
}
