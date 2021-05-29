package ThucHanhMultiThreading;

public class ThreadStateImlRunnable {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                Thread self = Thread.currentThread();
                System.out.println(self.getName() + " is " + self.getState());
            }
        });
        System.out.println(t.getName() + " is " + t.getState());

        t.start();
        t.join();

        if (t.getState() == Thread.State.TERMINATED) {
            System.out.println(t.getName() + " is terminated");
        }
    }
}
