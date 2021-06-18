package exerceise.elice;

public class Supplier {
    private String idSup;// mã nhà cung cấp
    private String name;
    private String address;
    private String tel;

    public Supplier(String idSup, String name, String address, String tel) {
        this.idSup = idSup;
        this.name = name;
        this.address = address;
        this.tel = tel;
    }

    public String getIdSup() {
        return idSup;
    }

    public void setIdSup(String idSup) {
        this.idSup = idSup;
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
        return "Supplier{" +
                "idSup='" + idSup + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
