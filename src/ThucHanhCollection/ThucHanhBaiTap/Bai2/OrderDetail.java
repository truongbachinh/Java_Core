package ThucHanhCollection.ThucHanhBaiTap.Bai2;

public class OrderDetail implements Comparable<OrderDetail> {
    private int idOrder;
    private int idDetail;
    private int itemId;
    private int Amount;
    private float Price;

    public OrderDetail() {
    }

    public OrderDetail(int idOrder, int idDetail) {
        this.idOrder = idOrder;
        this.idDetail = idDetail;
    }

    public OrderDetail(int idOrder, int idDetail, int itemId, int amount, float price) {
        this.idOrder = idOrder;
        this.idDetail = idDetail;
        this.itemId = itemId;
        Amount = amount;
        Price = price;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "idOrder=" + idOrder +
                ", idDetail=" + idDetail +
                ", itemId=" + itemId +
                ", Amount=" + Amount +
                ", Price=" + Price +
                '}';
    }

    @Override
    public int compareTo(OrderDetail o) {
        return this.idOrder - o.idOrder;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
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
        return Amount;
    }

    public void setAmount(int amount) {
        Amount = amount;
    }

    public float getPrice() {
        return Price;
    }

    public void setPrice(float price) {
        Price = price;
    }
}
