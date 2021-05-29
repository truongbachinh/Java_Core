package ThucHanhCollection.ThucHanhBaiTap.Bai1;

import java.util.Objects;

public class Depositors implements Comparable<Depositors> {
    private Integer id;
    private String fullname;
    private String address;
    private String phone;
    private String DOB;

    public Depositors() {
    }

    public Depositors(Integer id, String fullname, String address, String phone, String DOB) {
        this.id = id;
        this.fullname = fullname;
        this.address = address;
        this.phone = phone;
        this.DOB = DOB;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    @Override
    public String toString() {
        return "Depositors{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", DOB='" + DOB + '\'' +
                '}';
    }

    @Override
    public int compareTo(Depositors o) {
        int result = 0;
        if (this.id > o.id) {


            result = 1;
        } else if (this.id < o.id) {


            result = -1;
        } else {


            result = 0;
        }
        if (this.fullname.compareTo(o.fullname) != 0) {
            result = this.fullname.compareTo(o.fullname);
        }
        if (this.address.compareTo(o.address) != 0) {
            result = this.address.compareTo(o.address);
        }
        if (this.phone.compareTo(o.phone) != 0) {
            result = this.phone.compareTo(o.phone);
        }
        if (this.DOB.compareTo(o.DOB) != 0) {
            result = this.DOB.compareTo(o.DOB);
        }

        return result;
    }

}
