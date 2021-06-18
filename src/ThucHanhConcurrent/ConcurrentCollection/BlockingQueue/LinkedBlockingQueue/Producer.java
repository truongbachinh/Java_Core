package ThucHanhConcurrent.ConcurrentCollection.BlockingQueue.LinkedBlockingQueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<Integer> queue;
    public Producer (BlockingQueue<Integer> queue) {
        this.queue = queue;
    }
    public void run() {
        try {
            while (true)  {
                Integer number = produce();
                queue.put(number);
                System.out.println("PRODUCER: created " + number);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
    private Integer produce() {
        Random random = new Random();
        Integer number = random.nextInt(100);
        // fake producing time
        try {
            Thread.sleep(random.nextInt(1000));
        } catch (InterruptedException ie) { ie.printStackTrace(); }
        return number;
    }
}
