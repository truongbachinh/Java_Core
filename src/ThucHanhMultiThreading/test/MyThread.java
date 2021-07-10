package ThucHanhMultiThreading.test;

public class MyThread extends Thread{
    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("i: " + i);
                Thread.sleep(3000);

            }
        }
        catch (InterruptedException e)
        {
            e.getMessage();
        }

    }

    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 =  new MyThread();
        myThread1.start();
        myThread2.start();
        System.out.println("Completed !");
        Thread thread =  new Thread();
        System.out.println(thread.getName());
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                try {
                    for (int i = 100; i > 0 ; i--) {
                        System.out.println("I: " + i);
                        Thread.sleep(1000);
                    }
                }
                catch (InterruptedException e)
                {
                    e.getCause();
                }

            }
        };
        thread1.start();
    }
}
