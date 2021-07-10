package ThucHanhMultiThreading.ExtendThread;

public class TestThreadExtend  extends Thread{
    @Override
    public void run()
    {
        System.out.println("heelooo");
    }

    public static void main(String[] args) {
        TestThreadExtend t =  new TestThreadExtend();
        t.run();
        t.start();
    }
}
