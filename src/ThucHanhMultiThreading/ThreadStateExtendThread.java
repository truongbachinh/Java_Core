package ThucHanhMultiThreading;

public class ThreadStateExtendThread extends Thread {
    public void run() {
        System.out.println("My name iss " + getName());
    }

    public static void main(String[] args) {
        Thread t1 = new ThreadStateExtendThread();
        t1.start();
        System.out.println("My name is " + Thread.currentThread().getName());
    }
}
