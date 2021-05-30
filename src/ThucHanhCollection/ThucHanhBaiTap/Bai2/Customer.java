package ThucHanhCollection.ThucHanhBaiTap.Bai2;

public class Customer implements Comparable<Customer> {
    private int idCus;
    private String name;
    private String address;
    private String tel;

    public Customer() {
    }

    public Customer(int idCus, String name, String address, String tel) {
        this.idCus = idCus;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public int getIdCus() {
        return idCus;
    }

    public void setIdCus(int idCus) {
        this.idCus = idCus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "idCus=" + idCus +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        int count = 0;
        if (this.idCus - o.idCus != 0) {
            count = this.idCus - o.idCus;
        }
        if (this.name.compareTo(o.name) == 0) {
            count = this.name.compareTo(o.name);
        }
        return count;
    }
}
