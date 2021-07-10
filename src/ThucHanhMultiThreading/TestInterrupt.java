package ThucHanhMultiThreading;

public class TestInterrupt extends Thread{
    public TestInterrupt (String st)
    {
        super.setName(st);
    }
    @Override
    public void run()
    {
        System.out.println("Thread running" + this.getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("In số theo thứ tự: " + i);
            if(Thread.interrupted())
            {
                System.out.println("Chương trình bị dừng");
                return;
            }
        }
    }
    public static void main(String[] args) {
        Thread thread1 = new TestInterrupt("Tong");

        thread1.start();
      //  thread1.interrupt();
        try {
            Thread mainThread =   Thread.currentThread();
            System.out.println("Thread get name: " + mainThread.getName());
            Thread.sleep(1);
            thread1.interrupt();// chương trình bị dừng
        }catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }

    }
}
