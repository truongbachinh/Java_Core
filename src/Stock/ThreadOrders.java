package Stock;

import java.util.Date;
import java.util.Map;
import java.util.Queue;
import java.util.Random;

public class ThreadOrders extends Thread {
    private String stockId;
    private Stock stock;
    private boolean sell;
    private Counter counter;
    private Queue<TraderOrder> queue_orders;

    public ThreadOrders(Map<String, Stock> listed_stock, String stockId, boolean sell, Counter counter) {
        this.stock = listed_stock.get(stockId);
        this.sell = sell;
        if (sell) {
            this.queue_orders = stock.getQueueSell();
        } else {
            this.queue_orders = stock.getQueueBuy();
        }
        this.counter = counter;
    }

    public void run() {
        Random generator = new Random();
        while (true) {
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            int orderId = counter.increment();
            Date curDate = new Date();
            String traderId = "0" + (generator.nextInt(6) + 1);
            String stockId = stock.getId();
            int amount = generator.nextInt(100) + 100;
            float price = generator.nextInt(10) + 10;
            queue_orders.add(new TraderOrder(orderId, curDate, traderId, stockId, sell, amount, price));
            // System.out.println("queue order: " + queue_orders.peek());
        }
    }
}
