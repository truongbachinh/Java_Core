package IO_Streams.dataStream;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class testDataStream {

    static String dataFile;

    public static void ghiArrayFile(int[] A) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ten outputfile: ");
        dataFile = "src/" + sc.next() + ".dat";

        DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(dataFile)));
        try {
            for (int x : A) {
                out.writeInt(x);
            }
        } catch (IOException ex) {
        }

        out.close();
    }

    public static void main(String[] args) throws IOException {
        int[] A = {12, 8, 13, 29, 50, 22, 25, 14, 20};
        ghiArrayFile(A);
        //

        // Đọc dữ liệu

        DataInputStream in = new DataInputStream(new BufferedInputStream
                (new FileInputStream(dataFile)));
        int[] AA = new int[A.length];
        int l = A.length;
        try {
            for (int i = 0; i < l; i++) {
                AA[i] = in.readInt();
            }
            System.out.println("Mảng trước khi sắp xếp: ");
            System.out.println(Arrays.toString(AA));
            System.out.println("-----------------------");

            ;
            int temp;
            for (int i = 1; i < AA.length; i++) {
                temp = AA[i];
                int j = i - 1;
                for (; j >= 0 && temp < AA[j]; j--) {
                    AA[j + 1] = AA[j];
                }
                AA[j + 1] = temp;

            }

            System.out.println("Mảng sau khi sắp xếp: ");
            System.out.println(Arrays.toString(AA));

            ghiArrayFile(AA);
        } catch (IOException ex) {
            in.close();
        }

    }
}
