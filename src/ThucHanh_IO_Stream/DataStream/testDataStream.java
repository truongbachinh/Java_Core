package ThucHanh_IO_Stream.DataStream;

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

//            for (int i = 0; i < AA.length; i++) {
//                int position = i;
//                int temp = AA[i];
//                for (int j = i + 1; j < AA.length; j++) {
//                    if(temp > AA[j])
//                    {
//                        temp = AA[j];
//                        position = j;
//                    }
//                }
//                AA[position] = AA[i];
//                AA[i] = temp;
//
//
//            }
            int temp;
            for (int i = 0; i < AA.length - 1; i++) {
                for (int j = 0; j < AA.length-1; j++) {
                    if(AA[j] > AA[j+1])
                    {

                    }
                }
            }

            System.out.println("Mảng sau khi sắp xếp: ");
            System.out.println(Arrays.toString(AA));

            ghiArrayFile(AA);
        } catch (IOException ex) {
            in.close();
        }

    }
}
