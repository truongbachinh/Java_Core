package ThucHanhException.Throw_Throws;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.Arrays;
import java.util.Scanner;


class arrayOutOfBoundsException extends Exception {
    public arrayOutOfBoundsException(String st) {
        super(st);
    }
}

public class Bai2 {

    public static void main(String[] args) {

        try {
            printArray();
        } catch (arrayOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int[] B = new int[10];
        for (int i = 0; i < B.length; i++) {
            B[i] = i++;
        }
        System.out.println(Arrays.toString(B));
    }

    public static void printArray() throws arrayOutOfBoundsException {
        try {
            inputArray();
        } catch (arrayOutOfBoundsException ex) {
            throw ex;
        } finally {
            System.out.println("Ngoại lệ ko được xử lý tại printArray");
        }
    }

    public static void inputArray() throws arrayOutOfBoundsException {

        int[] A = new int[8];
        for (int i = 0; i < 10; i++) {
            if (i > 7) {
                throw new arrayOutOfBoundsException("Nhập vào quá giới hạn của mảng");
            }
            A[i] = i++;

        }
    }
}
