package Stock;

import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

public class Stock {
    private String Id;
    private String Alias;
    private String Name;
    private Queue<TraderOrder> sell_orders = new PriorityBlockingQueue<>();
    private Queue<TraderOrder> buy_orders = new PriorityBlockingQueue<>(1000, Collections.reverseOrder());

    public Stock() {
    }

    public Stock(String Id, String Alias, String Name) {
        this.Id = Id;
        this.Alias = Alias;
        this.Name = Name;

    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getId() {
        return this.Id;
    }

    public String getAlias() {
        return this.Alias;
    }

    public String getName() {
        return this.Name;
    }

    public void setAddQueueSell(TraderOrder TraderOrder) {
        this.sell_orders.add(TraderOrder);
    }

    public void setQueueSell(Queue<TraderOrder> sell_orders) {
        this.sell_orders = sell_orders;
    }

    public Queue<TraderOrder> getQueueSell() {
        return this.sell_orders;
    }

    public void setAddQueueBuy(TraderOrder TraderOrder) {
        this.buy_orders.add(TraderOrder);
    }

    public void setQueueBuy(Queue<TraderOrder> buy_orders) {
        this.buy_orders = buy_orders;
    }

    public Queue<TraderOrder> getQueueBuy() {
        return this.buy_orders;
    }

    public int hashCode() {
        return this.Id.hashCode();
    }

    public boolean equals(Object object) {
        Stock sto = (Stock) object;
        if (this.getId().compareTo(sto.getId()) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "\n" + Id + " : " + Alias + " : " + Name;
    }
}
