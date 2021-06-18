package exerceise.elice;

public class OrderDetail implements Comparable<OrderDetail>{
    private int idDetail;// mã hoá đơn bán hàng chi tiết
    private int idOrder; // mã hoá đơn
    private int itemID;// mã hàng
    private int amount;// số lượng hàng
    private double price; //đơn giá


    public OrderDetail(int idDetail, int idOrder, int itemID, int amount, double price) {
        this.idDetail = idDetail;
        this.idOrder = idOrder;
        this.itemID = itemID;
        this.amount = amount;
        this.price = price;
    }

    public int getIdDetail() {
        return idDetail;
    }

    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
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
    public int compareTo(OrderDetail o) {
        return this.idDetail - o.idDetail;
    }

    @Override
    public String toString() {
        return "OrderDetail{" +
                "idDetail=" + idDetail +
                ", idOrder=" + idOrder +
                ", itemID=" + itemID +
                ", amount=" + amount +
                ", price=" + price +
                '}';
    }
}
