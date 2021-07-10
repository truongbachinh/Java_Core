package ThucHanh_IO_Stream.TestLDCD;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IO_Object {
    public static void main(String[] args) {
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream( new BufferedOutputStream( new FileOutputStream("src/studentchinh1.dat")));
            Student student1 = new Student("Chinh", 912012903,"Thanh Hoa","anhchinh@gmail.com");
            Student student2 = new Student("Linh", 912012902,"Nghe An","tranlinh@gmail.com");
            List<Student> studentList =  new ArrayList<>();
            studentList.add(student1);
            studentList.add(student2);

            for (Student s: studentList) {
                objectOutputStream.writeUTF(s.getName());
                objectOutputStream.writeUTF(s.getAddress());
                objectOutputStream.writeUTF(s.getEmail());
                objectOutputStream.writeInt(s.getPhone());
            }
            objectOutputStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        docFileObject();
    }
    public static void docFileObject()
    {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(new BufferedInputStream( new FileInputStream("src/studentChinh1.dat")));

           List<Student> studentList = new ArrayList<>(5);
            for (int i = 0; i < 2; i++) {
                String name = objectInputStream.readUTF();
                System.out.println(name);
                int phone = objectInputStream.readInt();
                String address = objectInputStream.readUTF();
                String email = objectInputStream.readUTF();
                studentList.add(new Student(name,phone,address,email));
            }
            for (Student s: studentList) {
                System.out.println(s.getName());
                System.out.println(s.getAddress());
                System.out.println(s.getPhone());
                System.out.println(s.getEmail());
            }


        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
