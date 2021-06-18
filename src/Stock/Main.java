package Stock;

import java.util.*;

public class Main {
    static final int NUM_BUY_THREADS = 3;
    static final int NUM_SELL_THREADS = 5;

    public static void main(String args[]) {
        Stock stock1 = new Stock("ST1", "Bitcoin", "BTC");
        Stock stock2 = new Stock("ST2", "Ethereum", "ETH");
        Stock stock3 = new Stock("ST3", "Dogecoin", "Doge");
        Stock stock4 = new Stock("ST4", "RIPPLE", "XRP");
        Stock stock5 = new Stock("ST5", "Maker", "MKR");
        Stock stock6 = new Stock("ST5", "Cardano", "ADA");
        Trader tra01 = new Trader("01", "Chính1", "Thanh Hóa", "0123", 10000.0);
        Trader tra02 = new Trader("02", "Chính2", "Thanh Hóa", "0125", 10000.0);
        Trader tra03 = new Trader("03", "Chính3", "Nghệ an", "0125", 10000.0);
        Trader tra04 = new Trader("04", "Chính4", "Hà nội", "0125", 10000.0);
        Trader tra05 = new Trader("05", "Chính5", "Hà nội", "0125", 10000.0);

        Map<String, Trader> registered = new TreeMap<>();
        Map<String, Stock> listed_stock = new HashMap<>();

        listed_stock.put(stock1.getId(), stock1);
        listed_stock.put(stock2.getId(), stock2);
        listed_stock.put(stock3.getId(), stock3);
        listed_stock.put(stock4.getId(), stock4);
        listed_stock.put(stock5.getId(), stock5);
        registered.put(tra01.getId(), tra01);
        registered.put(tra02.getId(), tra02);
        registered.put(tra03.getId(), tra03);
        registered.put(tra04.getId(), tra04);
        registered.put(tra05.getId(), tra05);


        stock_exchange[] threads = new stock_exchange[listed_stock.size()];
        // ---------khop lenh cho stock-----------------------
        int stoIndex = 0;
        for (Map.Entry<String, Stock> x : listed_stock.entrySet()) {
            threads[stoIndex] = new stock_exchange(listed_stock, registered, x.getValue());
            threads[stoIndex].start();
            stoIndex++;
        }

    }
}
