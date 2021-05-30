package ThucHanhCollection.ThucHanhBaiTap.Bai2;

import java.util.Date;

public class Order implements Comparable {
    private int idOrder;
    private Date orDate;
    private String customerId;

    public Order() {

    }

    public Order(int idOrder) {
        this.idOrder = idOrder;
    }

    public Order(int idOrder, Date orDate, String customerId) {
        this.idOrder = idOrder;
        this.orDate = orDate;
        this.customerId = customerId;
    }

    @Override
    public int compareTo(Object o) {
        return this.idOrder - idOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", orDate=" + orDate +
                ", customerId='" + customerId + '\'' +
                '}';
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getOrDate() {
        return orDate;
    }

    public void setOrDate(Date orDate) {
        this.orDate = orDate;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
