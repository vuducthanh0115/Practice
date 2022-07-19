package IO;

import java.io.BufferedReader;
import java.io.FileReader;

public class Buffer {
    public static void main(String[] args) {
        char[] arr = new char[100];
        try {
            FileReader r = new FileReader("H:\\input.txt");
            BufferedReader buffer = new BufferedReader(r);

            String line = null;
            while ((line = buffer.readLine()) != null) {
                System.out.println(line);
            }
            buffer.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
