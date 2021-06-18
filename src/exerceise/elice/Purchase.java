package exerceise.elice;

import java.util.Date;

public class Purchase {
    private int idPurchase;// mã đơn nhập hàng
    private Date purDate;// ngày nhập hàng
    private String supplierID;// mã nhà cung cấp

    public Purchase(int idPurchase, Date purDate, String supplierID) {
        this.idPurchase = idPurchase;
        this.purDate = purDate;
        this.supplierID = supplierID;
    }

    public int getIdPurchase() {
        return idPurchase;
    }

    public void setIdPurchase(int idPurchase) {
        this.idPurchase = idPurchase;
    }

    public Date getPurDate() {
        return purDate;
    }

    public void setPurDate(Date purDate) {
        this.purDate = purDate;
    }

    public String getSupplierID() {
        return supplierID;
    }

    public void setSupplierID(String supplierID) {
        this.supplierID = supplierID;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "idPurchase=" + idPurchase +
                ", purDate=" + purDate +
                ", supplierID='" + supplierID + '\'' +
                '}';
    }
}

