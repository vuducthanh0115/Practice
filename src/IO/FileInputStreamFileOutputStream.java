package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputStreamFileOutputStream {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileInputStream input = new FileInputStream("H:\\output.txt");
            System.out.println("So byte : " + input.available());

            byte[] arr = new byte[input.available()];
            input.read(arr);
            System.out.println("Doc file thanh cong");
            //Convert byte arr to String
            String data = new String(arr, "UTF8");
            System.out.println(data);
            input.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /*public static void main(String[] args) {
        String data = "Hello, Thanh Vu Thành @";
        try {
            FileOutputStream output = new FileOutputStream("H:\\output.txt");
            //Convert String into byte array
            byte[] dataByte = data.getBytes("UTF-8");
            output.write(dataByte);
            System.out.println("Ghi file thanh cong");
            output.close();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }*/
}

