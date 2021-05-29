package IO_Streams.dataStream.DataStream_Student;



import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private String fullName;
    private String date;
    private String address;
    public Student()
    {

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

