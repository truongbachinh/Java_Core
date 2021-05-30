package ThucHanhCollection.ThucHanhBaiTap.Bai2;

import java.util.Objects;

public class PurchaseDetail implements Comparable<PurchaseDetail> {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PurchaseDetail)) return false;
        PurchaseDetail that = (PurchaseDetail) o;
        return getIdPurchase() == that.getIdPurchase() &&
                getIdDetail() == that.getIdDetail() &&
                getItemId() == that.getItemId() &&
                getAmount() == that.getAmount() &&
                Float.compare(that.getPrice(), getPrice()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPurchase(), getIdDetail(), getItemId(), getAmount(), getPrice());
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

    @Override
    public int compareTo(PurchaseDetail o) {
        return this.idPurchase - o.idPurchase;
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
