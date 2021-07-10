package ThucHanhMultiThreading.ImplementRunable;

public class TestRunable  implements Runnable{
    @Override
    public void run()
    {
        System.out.println("threading");
    }

    public static void main(String[] args) {
        TestRunable t = new TestRunable();
        Thread s = new Thread(t);
       s.start();


    }
}
