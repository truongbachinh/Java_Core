package Stock;

import java.util.Date;

public class TraderOrder implements Comparable<TraderOrder> {
    private int IdOrder;
    private Date OrdDate;
    private String TraderID;
    private String stockID;
    private boolean sell;
    private int Amount; // so luong stock
    private float Price; // gia mong muon

    public TraderOrder() {
    }

    public TraderOrder(int IdOrder, Date OrdDate, String TraderID, String stockID, boolean sell, int Amount,
                       float Price) {
        this.IdOrder = IdOrder;
        this.OrdDate = OrdDate;
        this.TraderID = TraderID;
        this.stockID = stockID;
        this.sell = sell;
        this.Amount = Amount;
        this.Price = Price;

    }

    public void setId(int IdOrder) {
        this.IdOrder = IdOrder;
    }

    public String getTraderId() {
        return this.TraderID;
    }

    public String getstockId() {
        return this.stockID;
    }

    public boolean getStatus() {
        return this.sell;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public int getAmount() {
        return this.Amount;
    }

    public float getPrice() {
        return this.Price;
    }

    public int compareTo(TraderOrder Order) {
        if (this.Price > Order.Price) {
            return 1;
        }
        if (this.Price < Order.Price) {
            return -1;
        } else {
            return 0;
        }
    }

    public String toString() {
        return "\n" + IdOrder + " : " + TraderID + " : " + stockID + " : " + (sell ? "sell" : "buy") + " : " + Amount
                + " : " + Price;
    }
}
