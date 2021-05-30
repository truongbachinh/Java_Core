package ThucHanhCollection.ThucHanhBaiTap.Bai2;

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
