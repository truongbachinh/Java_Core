/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO_Streams.charStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author Hung
 */
public class FileReaderAndFileWriter {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;
        try {
            inputStream = new FileReader("src/inputChar.txt");
            outputStream = new FileWriter("src/outputChar.txt");
            int i = 1;
            int[] Arr = new int[i];
            while ((inputStream.read()) != -1) {
                Arr[i] = (inputStream.read());
                i++;
            }
            System.out.println(Arrays.toString(Arr));
            System.exit(0);
            outputStream.write("Nguyễn Mạnh Hùng");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}
