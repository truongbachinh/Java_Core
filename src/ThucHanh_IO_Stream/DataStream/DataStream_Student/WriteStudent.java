package ThucHanh_IO_Stream.DataStream.DataStream_Student;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteStudent {

    static String dataFile;
    DataOutputStream dataOut;

    public WriteStudent() throws FileNotFoundException {
        dataOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
    }

    private void close() throws IOException {
        dataOut.close();
    }


    public static void main(String[] args) throws IOException {
        List<Student> listStudent = new ArrayList<>();
        listStudent.add(new Student("Chinh", "20051998", "Thanh Hoa"));
        listStudent.add(new Student("Linh", "26101999", "Vinh Phuc"));
        ghiFile(listStudent);
    }

    public void write(Student student) throws IOException {
        dataOut.writeChars(student.getFullName());
        dataOut.writeChars(student.getDate());
        dataOut.writeChars(student.getAddress());
    }

    public static void ghiFile(List<Student> listStudent) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten outputfile: ");
        dataFile = "src/" + sc.next() + ".dat";
        WriteStudent writeStudent = new WriteStudent();
        try {
            for (Student student : listStudent) {
                writeStudent.write(student);
            }

        } catch (Exception e) {

        }
        writeStudent.close();

    }



}


