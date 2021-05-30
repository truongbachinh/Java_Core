package ThucHanhCollection.ThucHanhBaiTap.Bai2;

import java.util.Date;
import java.util.Objects;

public class Purchase implements Comparable<Purchase> {
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

    @Override
    public int compareTo(Purchase o) {
        return this.idPurchase - o.idPurchase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchase)) return false;
        Purchase purchase = (Purchase) o;
        return getIdPurchase() == purchase.getIdPurchase() &&
                Objects.equals(getPurDate(), purchase.getPurDate()) &&
                Objects.equals(getSupplierId(), purchase.getSupplierId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdPurchase(), getPurDate(), getSupplierId());
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
