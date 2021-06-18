package ThucHanhConcurrent.ConcurrentCollection.BlockingQueue.DelayQueue;

import java.time.LocalDateTime;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class DelayedItemProducer implements Runnable{
    private final DelayQueue<DelayItem> queue;

    private AtomicInteger counter;

    public DelayedItemProducer(DelayQueue<DelayItem> queue, AtomicInteger counter)
    {
        this.queue = queue;
        this.counter = counter;
    }

    @Override
    public void run() {
        LocalDateTime now = LocalDateTime.now();
        int id = counter.incrementAndGet();
        DelayItem item = new DelayItem(id, "Task-" + id, now);
        System.out.println("Added to queue :: " + item);
        queue.add(item);
    }
}
