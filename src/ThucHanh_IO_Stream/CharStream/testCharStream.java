package ThucHanh_IO_Stream.CharStream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class testCharStream {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader("src/ad.txt");
            fileWriter = new FileWriter("src/adOut.txt");
            int resultRead;
            while ((resultRead = fileReader.read()) != -1) {
                fileWriter.write(resultRead);
            }

            fileWriter.write("26-12-2020");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (fileWriter != null)
                fileReader.close();
            if (fileWriter != null)
                fileWriter.close();
        }

    }
}
