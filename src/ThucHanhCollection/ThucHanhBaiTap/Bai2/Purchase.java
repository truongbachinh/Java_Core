package ThucHanhCollection.ThucHanhBaiTap.Bai2;

import java.util.Date;

public class Purchase {
    private int idPurchase;
    private Date purDate;
    private String SupplierId;

    public Purchase() {
    }

    public Purchase(int idPurchase, Date purDate, String supplierId) {
        this.idPurchase = idPurchase;
        this.purDate = purDate;
        SupplierId = supplierId;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "idPurchase=" + idPurchase +
                ", purDate=" + purDate +
                ", SupplierId='" + SupplierId + '\'' +
                '}';
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

    public String getSupplierId() {
        return SupplierId;
    }

    public void setSupplierId(String supplierId) {
        SupplierId = supplierId;
    }

}
