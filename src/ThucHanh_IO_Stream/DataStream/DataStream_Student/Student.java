package ThucHanh_IO_Stream.DataStream.DataStream_Student;


import java.io.Serializable;

public class Student implements Serializable {
    private String fullName;
    private String date;
    private String address;

    public Student() {

    }

    public Student(String fullName, String date, String address) {
        this.fullName = fullName;
        this.date = date;
        this.address = address;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

