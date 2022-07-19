package IO;

import java.io.FileReader;
import java.io.Reader;

public class ReadWrite {
    public static void main(String[] args) {
        String data = "Vu Duc Thanh";

        char[] arr = new char[12];
        try {

            /*Writer w = new FileWriter("H:\\writer.txt");
            w.write(data);
            w.close();
            */

            Reader r = new FileReader("H:\\writer.txt");
            r.read(arr);
            System.out.println(arr);
            r.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
