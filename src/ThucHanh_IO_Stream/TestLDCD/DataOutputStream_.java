package ThucHanh_IO_Stream.TestLDCD;

import java.io.*;

public class DataOutputStream_ {
    public static void main(String[] args) throws FileNotFoundException {
        DataOutputStream file = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/ldcdO2.txt")));
        int[] a = {1, 2, 3, 4};
        String s = "adchinh";
        try {

            for (int i = 0; i < a.length; i++) {
                file.writeInt(a[i]);
            }
            file.writeUTF(s);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("src/ldcdO2.txt")));

        try {
            int[]A = new int[a.length];
            for (int i = 0; i < A.length; i++) {
                A[i] = dataInputStream.readInt();
            }
            System.out.println(dataInputStream.readUTF());
            for (int i: A
                 ) {
                System.out.println(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
