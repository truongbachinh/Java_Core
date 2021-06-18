package exerceise.elice;

import java.util.Date;

public class Order  implements Comparable<Order>{
    private int idOrder;// mã hoá đơn bán hàng
    private Date ordDate;// ngày hoá đơn
    private String customerID; // mã khách hàng


    public Order(int idOrder, Date ordDate, String customerID) {
        this.idOrder = idOrder;
        this.ordDate = ordDate;
        this.customerID = customerID;
    }

    public int getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(int idOrder) {
        this.idOrder = idOrder;
    }

    public Date getOrdDate() {
        return ordDate;
    }

    public void setOrdDate(Date ordDate) {
        this.ordDate = ordDate;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    @Override
    public int compareTo(Order o) {
        return this.idOrder - o.idOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "idOrder=" + idOrder +
                ", ordDate=" + ordDate +
                ", customerID='" + customerID + '\'' +
                '}';
    }
}
