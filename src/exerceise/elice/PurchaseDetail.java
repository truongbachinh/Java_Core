package exerceise.elice;

public class PurchaseDetail {
    private int idPurchase;
    private int idDetail;
    private int itemID; //mã sản phẩm
    private int amount;
    private double price;

    public PurchaseDetail(int idPurchase, int idDetail, int itemID, int amount, double price) {
        this.idPurchase = idPurchase;
        this.idDetail = idDetail;
        this.itemID = itemID;
        this.amount = amount;
        this.price = price;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "PurchaseDetail{" +
                "idPurchase=" + idPurchase +
                ", idDetail=" + idDetail +
                ", itemID=" + itemID +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
