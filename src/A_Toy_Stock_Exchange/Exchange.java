package A_Toy_Stock_Exchange;

import java.util.*;

public class Exchange extends Thread {
    private static final int NUM_BUY_THREADS = 3;
    private static final int NUM_SELL_THREADS = 5;
    private Map<String, Stock> listed_stock;
    private Map<String, Trader> registered;
    private Stock sto;

    public Exchange(Map<String, Stock> listed_stock, Map<String, Trader> registered, Stock sto) {
        this.listed_stock = listed_stock;
        this.registered = registered;
        this.sto = sto;
    }

    public void run() {
        // ---------khop lenh cho stock-----------------------
        String stoId = this.sto.getId();
        String stoName = this.sto.getAlias();
        ThreadOrders[] buy_Threads = new ThreadOrders[NUM_BUY_THREADS];
        ThreadOrders[] sell_Threads = new ThreadOrders[NUM_SELL_THREADS];
        Counter buyOrderId = new Counter(1);
        Counter sellOrderId = new Counter(1);
        for (int i = 0; i < NUM_BUY_THREADS; i++) {
            buy_Threads[i] = new ThreadOrders(this.listed_stock, stoId, false, buyOrderId);
            buy_Threads[i].start();
        }
        for (int i = 0; i < NUM_SELL_THREADS; i++) {
            sell_Threads[i] = new ThreadOrders(this.listed_stock, stoId, true, sellOrderId);
            sell_Threads[i].start();
        }
        Queue<TraderOrder> sell_orders = this.sto.getQueueSell();
        Queue<TraderOrder> buy_orders = this.sto.getQueueBuy();
        Counter sumTransaction = new Counter(0.0);
        while (true) {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("\nKhop lenh mua va ban co phieu " + stoName + ": ");
            while (!buy_orders.isEmpty() && !sell_orders.isEmpty()
                    && buy_orders.peek().getPrice() >= sell_orders.peek().getPrice()) {

                TraderOrder buy_order = buy_orders.poll();
                TraderOrder sell_order = sell_orders.poll();

                double price = sell_order.getPrice();

                int stock_tranfer_amount = sell_order.getAmount();

                int buyRemain = buy_order.getAmount() - sell_order.getAmount();
                if (buyRemain > 0) {
                    buy_order.setAmount(buyRemain);
                    buy_orders.add(buy_order);
                    stock_tranfer_amount = sell_order.getAmount();
                }
                if (buyRemain < 0) {
                    sell_order.setAmount(-buyRemain);
                    sell_orders.add(sell_order);
                    stock_tranfer_amount = buy_order.getAmount();
                }

                double money_tranfer = price * stock_tranfer_amount;

                Trader tra_buy = this.registered.get(buy_order.getTraderId());
                tra_buy.setMoney(tra_buy.getMoney() - money_tranfer);
                int addAmount = tra_buy.getStockAmount(this.sto) + stock_tranfer_amount;
                tra_buy.setStockAmount(this.sto, addAmount);

                Trader tra_sell = this.registered.get(sell_order.getTraderId());
                tra_sell.setMoney(tra_sell.getMoney() + money_tranfer);
                int mineAmount = tra_sell.getStockAmount(this.sto) - stock_tranfer_amount;
                tra_sell.setStockAmount(this.sto, mineAmount);

                // Output: Trader1 mua từ: Trader3 (100) với giá: 50
                String buy_name = this.registered.get(buy_order.getTraderId()).getName();
                String sell_name = this.registered.get(sell_order.getTraderId()).getName();
                System.out.printf("%s: %s mua tu: %s (%d) voi gia: %.1f\n", stoName, buy_name, sell_name,
                        stock_tranfer_amount, price);
                sumTransaction.addSum(money_tranfer);
            }
            System.out.println("Sum Transaction " + stoName + ": " + sumTransaction.getSum());

            // for (Trader trader : this.registered.values()) {
            // System.out.println();
            // System.out.println(trader);
            // }
        }
    }

}
