package ThucHanh_IO_Stream.ObjectStream;

import com.sun.xml.internal.ws.api.model.SEIModel;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

class Student implements Serializable {
    private static final long serialVersion = 1L;
    private String fullname;
    private String dob;
    private String address;

    public Student() {
    }

    public Student(String fullname, String dob, String address) {
        super();
        this.fullname = fullname;
        this.dob = dob;
        this.address = address;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}


public class testObjectStreaam {
    private ObjectOutputStream outputStream;
    private ObjectInputStream inputStream;


    public testObjectStreaam() throws IOException {
        File file = new File("src/arrStudent.txt");
        if (!(file.exists())) {
            file.createNewFile();
        }
        outputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
    }

    public testObjectStreaam(File file) throws IOException {
        inputStream = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
    }


    public static void main(String[] args) throws NullPointerException, CloneNotSupportedException, IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Amount of student in array: ");
        int n = sc.nextInt();
        Student[] A = new Student[n];
        System.out.println("Provide information: ");
        for (int i = 0; i < n; i++) {
            System.out.println("fullname: ");
            String fullname = sc.next();
            System.out.println("DOB: ");
            String dob = sc.next();
            System.out.println("address: ");
            String address = sc.next();
            sc.nextLine();
            A[i] = new Student();
            A[i].setFullname(fullname);
            A[i].setDob(dob);
            A[i].setAddress(address);
        }


        testObjectStreaam test = new testObjectStreaam();
        try {
            test.ghiArrObjectFile(A);
        } catch (IOException exception) {
            exception.printStackTrace();
        }
        test.close();


        System.out.println("-----------------Read_File-------------------");
        System.out.println("Nhập tên file cần đọc");
        String st = sc.nextLine();
        File fileData = new File(st);
        testObjectStreaam testInput = new testObjectStreaam(fileData);
        try {
            Student[] AA = testInput.readInput();
            System.out.println(Arrays.toString(AA));
            for (Student S : AA) {
                System.out.println("Fullname: " + S.getFullname());
                System.out.println("DOB: " + S.getDob());
                System.out.println("Address: " + S.getAddress());
            }
            System.out.println("-----------------Sắp xếp tên theo thứ tự-------------------");
            Student temp;
            for (int i = 0; i < AA.length; i++) {
                for (int j = 0; j < AA.length - 1 - i; j++) {
                    if (AA[j].getFullname().compareTo(AA[j + 1].getFullname()) > 0) {
                        temp = AA[j];
                        AA[j] = AA[j + 1];
                        AA[j + 1] = temp;
                    }
                }
            }
            for (Student S : AA) {
                System.out.println("Fullname: " + S.getFullname());
                System.out.println("DOB: " + S.getDob());
                System.out.println("Address: " + S.getAddress());
            }


        } catch (Exception ex) {

        }


    }

    public Student[] readInput() throws IOException {
        Student[] arrST = new Student[2];
        try {
            for (int i = 0; i < arrST.length; i++) {
                String fullname = inputStream.readUTF();
                String dob = inputStream.readUTF();
                String address = inputStream.readUTF();
                Student st = new Student(fullname, dob, address);
                arrST[i] = st;
            }
        } catch (Exception io) {

        }
        inputStream.close();
        return arrST;
    }


    public void ghiArrObjectFile(Student[] st) throws IOException {
        for (int i = 0; i < st.length; i++) {
            outputStream.writeUTF(st[i].getFullname());
            outputStream.writeUTF(st[i].getDob());
            outputStream.writeUTF(st[i].getAddress());
        }


    }

    private void close() throws IOException {
        outputStream.close();
    }
}
