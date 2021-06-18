package ThucHanhConcurrent.ConcurrentCollection.BlockingQueue.DelayQueue;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) throws InterruptedException, ExecutionException
    {
        DelayQueue<DelayItem> queue = new DelayQueue<>();
        AtomicInteger counter = new AtomicInteger();

        ScheduledExecutorService ses = Executors.newScheduledThreadPool(2);

        ses.scheduleAtFixedRate(
                new DelayedItemProducer(queue, counter), 1, 2, TimeUnit.SECONDS);
        ses.scheduleAtFixedRate(
                new DelayItemConsumer(queue), 1, 10, TimeUnit.SECONDS);
    }
}
