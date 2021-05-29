package IO_Streams.dataStream.DataStream_Student;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadStudent {
    static String dataFile;
    DataInputStream dataInput;

    public ReadStudent(String dataFile) throws IOException {
        dataInput = new DataInputStream(new FileInputStream(dataFile));
    }

    public List<Student> readAll() throws IOException {
        List<Student> listStudent = new ArrayList<>();

        try {
            while (true) {
                String name = dataInput.readUTF();
                String dob = dataInput.readUTF();
                String address = dataInput.readUTF();
                Student student = new Student(name, dob, address);
                listStudent.add(student);
            }
        } catch (EOFException ex) {
        }
        dataInput.close();
        return listStudent;
    }

    public static void main(String[] args)  throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten outputfile: ");
        dataFile = "src/" + sc.next() + ".dat";
        try {
            ReadStudent reader = new ReadStudent(dataFile);
            List<Student> listStudent = reader.readAll();
            for (Student student : listStudent) {
                System.out.print(student.getFullName() + "\t");
                System.out.print(student.getDate() + "\t");
                System.out.print(student.getAddress() + "\t");
            }
        } catch (IOException ex) {

        }
    }
}
