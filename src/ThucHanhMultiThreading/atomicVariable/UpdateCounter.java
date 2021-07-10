package ThucHanhMultiThreading.atomicVariable;

public class UpdateCounter extends Thread{
    private Counter counter;
    public UpdateCounter(Counter counter)
    {
        this.counter = counter;
    }
    @Override
    public void run()
    {
        try {

            Thread.sleep(100);
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        counter.increment();
    }
}
