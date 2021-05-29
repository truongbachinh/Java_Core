package ThucHanh_IO_Stream.ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

class fileNotExitsExeption extends FileNotFoundException {
    fileNotExitsExeption(String string) {
        super(string);
    }
}

public class testByteStream {
    private static int[] PNG_CODE = {137, 80, 78, 71, 13, 10, 26, 10};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String file = "src/" + sc.nextLine();
        try {
            while (!(checkImage((file)))) {
                System.out.println("Not image");
                file = "src/" + sc.nextLine();
            }
            System.out.println("Image");
            displayImage(file);
        } catch (fileNotExitsExeption ex) {
            System.out.println(ex.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void displayImage(String image)
    {
        System.out.println("Đây là ảnh của image"+ image);
    }

    public static boolean checkImage(String fileName) throws FileNotFoundException, IOException {
        boolean isImage = true;
        try {
            InputStream inputStream = new FileInputStream(fileName);
            int[] headerBytes = new int[8];
            for (int i = 0; i < headerBytes.length; i++) {
                headerBytes[i] = inputStream.read();
                if (headerBytes[i] != PNG_CODE[i]) {
                    isImage = false;
                }
            }
        } catch (fileNotExitsExeption ex) {
            throw ex;

        } catch (IOException e) {
            throw e;
        }
        return isImage;
    }
}
