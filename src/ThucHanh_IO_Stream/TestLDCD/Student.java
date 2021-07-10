package ThucHanh_IO_Stream.TestLDCD;

import java.io.Serializable;

public class Student implements Serializable
{
    private static final long serialVersionUID  = 1L;
    private String name;
    private Integer phone;
    private String address;
    private String email;

    public Student(String name, Integer phone, String address, String email) {
        super();
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }
    public Student() {

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", phone=" + phone +
                        ", address='" + address + '\'' +
                        ", email='" + email + '\'';
    }
}
