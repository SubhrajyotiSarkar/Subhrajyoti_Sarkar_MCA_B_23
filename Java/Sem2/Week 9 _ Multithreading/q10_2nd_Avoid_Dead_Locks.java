public class q10_2nd_Avoid_Dead_Locks {
    public static void main(String[] args) {
        final q10_string_compare acc1 = new q10_string_compare();
        final q10_string_compare acc2 = new q10_string_compare();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                acc1.transfer(acc2, 10);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                acc2.transfer(acc1, 10);
            }
        });

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Balance in Account 1: " + acc1.getBalance());
        System.out.println("Balance in Account 2: " + acc2.getBalance());
    }
}