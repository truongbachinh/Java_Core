package ThucHanhConcurrent.ConcurrentCollection.BlockingQueue.DelayQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.DelayQueue;

public class DelayItemConsumer implements Runnable{
    private final DelayQueue<DelayItem> queue;
    public DelayItemConsumer(DelayQueue<DelayItem> queue)
    {
        this.queue = queue;
    }

    @Override
    public void run() {
        List<DelayItem> events = new ArrayList<>();
        queue.drainTo(events);
        System.out.println("\nEvent processing start **********\n");
        events.stream().forEach(System.out::println);
        System.out.println("\nEvent processing end **********\n");
    }
}
