package ThucHanh_IO_Stream.CharStream;

import java.io.*;

public class testBufferStream {
    public static void main(String[] args) {
        try {
            usingBufferReadWrite();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    public static void usingBufferReadWrite() throws IOException {
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        String fileCode;
        bufferedReader = new BufferedReader(new FileReader("src/ad.txt"));
        bufferedWriter = new BufferedWriter(new FileWriter("src/adTestBuffer.txt"));
        String[] A = {"Cili Seafood", "Group"};
        try {
            while ((fileCode = bufferedReader.readLine()) != null) {
                bufferedWriter.write(fileCode);
                bufferedWriter.newLine();
            }

            for (String st : A) {
                bufferedWriter.write(st);
                bufferedWriter.newLine();
            }
            bufferedWriter.write("Love You");

        } catch (IOException exception) {
            throw exception;
        } finally {
            if (bufferedReader != null) {
                bufferedReader.close();
            }
            if (bufferedWriter != null) {
                bufferedWriter.close();
            }
        }
    }
}
