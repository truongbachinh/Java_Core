package A_Toy_Stock_Exchange;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Trader trader1 = new Trader("TD1", "Chính1",  "Thanh Hóa", 200.000);
        Trader trader2 = new Trader("TD2", "Chính2",  "Nghệ an", 100.000);
        Trader trader3 = new Trader("TD3", "Chinh3",  "Hà nội", 300.000);
        Trader trader4 = new Trader("TD4", "Chinh4",  "Hà nội", 300.000);
        Trader trader5 = new Trader("TD5", "Chính5",  "Hà nội", 300.000);

        // regiter to stock exchange;  đăng kí thông tin với key là Id
        Map<String, Trader> registerTrader = new TreeMap<>();
        registerTrader.put(trader1.getId(), trader1);
        registerTrader.put(trader2.getId(), trader2);
        registerTrader.put(trader3.getId(), trader3);
        registerTrader.put(trader4.getId(), trader4);
        registerTrader.put(trader5.getId(), trader5);
        // login trader
        Set<Trader> loginedTrader = new TreeSet<>();
        loginedTrader.add(trader1);
        loginedTrader.add(trader2);
        loginedTrader.add(trader3);
        loginedTrader.add(trader4);
        loginedTrader.add(trader5);

        Stock stock1 = new Stock("ST1", "Bitcoin", "BTC");
        Stock stock2 = new Stock("ST2", "Ethereum", "ETH");
        Stock stock3 = new Stock("ST3", "Dogecoin", "Doge");
        Stock stock4 = new Stock("ST4", "RIPPLE", "XRP");
        Stock stock5 = new Stock("ST5", "Maker", "MKR");
        Stock stock6 = new Stock("ST6", "Cardano ", "ADA");
        //List stock need to exchange; lưu thông tin của các stock
        // including stock id và stock Map<StockId,Stock> =  new TreeMap<>();

        Map<String, Stock> listStockExchange = new TreeMap<>();
        listStockExchange.put(stock1.getId(), stock1);
        listStockExchange.put(stock2.getId(), stock2);
        listStockExchange.put(stock3.getId(), stock3);
        listStockExchange.put(stock4.getId(), stock4);
        listStockExchange.put(stock5.getId(), stock5);
        listStockExchange.put(stock6.getId(), stock6);






        //Mailbox for each trader
        Queue<String> msg = new LinkedList<>();



        // ví dụ trader 1 muốn mua cổ phiếu 1 {số lượng 15, với đơn giá cho mỗi cổ phiếu là 20vnđ}
        // => tổng tiền cần mua 300vnđ
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        String dateTimeExchange = dtf.format(now);

//        //stock1  check = true là bán
//        TraderOrder traderOrder1 = new TraderOrder(1, dateTimeExchange, trader1.getId(), stock1.getId(), 10, 20.000, true);
//        TraderOrder traderOrder2 = new TraderOrder(2, dateTimeExchange, trader2.getId(), stock1.getId(), 20, 18.000, true);
//        TraderOrder traderOrder3 = new TraderOrder(3, dateTimeExchange, trader3.getId(), stock1.getId(), 30, 15.000, true);
//
//        //stock 1 check = false là mua
//        TraderOrder traderOrder4 = new TraderOrder(4, dateTimeExchange, trader4.getId(), stock1.getId(), 40, 30.000, false);
//        TraderOrder traderOrder5 = new TraderOrder(5, dateTimeExchange, trader5.getId(), stock1.getId(), 20, 25.000, false);
//
//
//        Queue<TraderOrder> stockSell = new PriorityQueue<>(new ascPrice());
//        stockSell.add(traderOrder1);
//        stockSell.add(traderOrder2);
//        stockSell.add(traderOrder3);
//        Queue<TraderOrder> stockBuy = new PriorityQueue<>(new descPrice());
//        stockBuy.add(traderOrder4);
//        stockBuy.add(traderOrder5);
//
//        Stock st = new Stock();
//        st.setBuyStocks(stockBuy);
//        st.setSellStocks(stockSell);


        Exchange[] threads = new Exchange[listStockExchange.size()];
        // ---------khop lenh cho stock-----------------------
        int stoIndex = 0;
        for (Map.Entry<String, Stock> x : listStockExchange.entrySet()) {
            threads[stoIndex] = new Exchange(listStockExchange, registerTrader, x.getValue());
            threads[stoIndex].start();
            stoIndex++;
        }


    }
}


