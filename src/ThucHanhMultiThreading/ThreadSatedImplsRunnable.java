package ThucHanhMultiThreading;

public class ThreadSatedImplsRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("My name is " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Runnable t1 = new ThreadSatedImplsRunnable();
        Thread t2 = new Thread(t1);

        t2.start();

        System.out.println("SHE IS" + Thread.currentThread().getName());
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(" he is " + Thread.currentThread().getName());
            }
        });
        t3.start();

    }
}
