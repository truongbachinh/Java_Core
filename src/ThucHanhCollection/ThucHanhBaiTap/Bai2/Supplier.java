package ThucHanhCollection.ThucHanhBaiTap.Bai2;

import java.util.Objects;

public class Supplier {
    private String idSupplier;
    private String Name;
    private String Address;

    public Supplier() {
    }

    public Supplier(String idSupplier, String name, String address) {
        this.idSupplier = idSupplier;
        Name = name;
        Address = address;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "idSupplier='" + idSupplier + '\'' +
                ", Name='" + Name + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Supplier)) return false;
        Supplier supplier = (Supplier) o;
        return Objects.equals(getIdSupplier(), supplier.getIdSupplier()) &&
                Objects.equals(getName(), supplier.getName()) &&
                Objects.equals(getAddress(), supplier.getAddress());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdSupplier(), getName(), getAddress());
    }

    public String getIdSupplier() {
        return idSupplier;
    }

    public void setIdSupplier(String idSupplier) {
        this.idSupplier = idSupplier;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
