package ThucHanhCollection.ThucHanhBaiTap.Bai2;

public class PurchaseDetail {
    private int idPurchase;
    private int idDetail;
    private int itemId;
    private int amount;
    private float price;

    public PurchaseDetail() {
    }

    public PurchaseDetail(int idPurchase, int idDetail, int itemId, int amount, float price) {
        this.idPurchase = idPurchase;
        this.idDetail = idDetail;
        this.itemId = itemId;
        this.amount = amount;
        this.price = price;
    }

    @Override
    public String toString() {
        return "PurchaseDetail{" +
                "idPurchase=" + idPurchase +
                ", idDetail=" + idDetail +
                ", itemId=" + itemId +
                ", amount=" + amount +
                ", price=" + price +
                '}';
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

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
