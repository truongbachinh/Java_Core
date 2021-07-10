package ThucHanhMultiThreading.atomicVariable;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int value;
    private Lock lock = new ReentrantLock();
    public synchronized void increment()
    {
        value++;
    }
    public void decrement()
    {
        lock.lock();
        value--;
        lock.lock();
    }
    public synchronized int getValue()
    {

        return value;
    }
}

