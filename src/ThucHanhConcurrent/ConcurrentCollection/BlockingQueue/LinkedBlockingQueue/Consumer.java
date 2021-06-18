package ThucHanhConcurrent.ConcurrentCollection.BlockingQueue.LinkedBlockingQueue;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {
    private BlockingQueue<Integer> queue;

    public Consumer(BlockingQueue<Integer> queue) {
        this.queue = queue;
    }

    public void run() {
        try {
            while (true) {
                Integer number = queue.take();
                consume(number);
            }
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    private void consume(Integer number) {
        // fake consuming time
        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(1));
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Consumer: processed " + number);
    }
}
