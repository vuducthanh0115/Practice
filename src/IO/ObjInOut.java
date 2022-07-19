package IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjInOut {
    public static void main(String[] args) {
        Student student = new Student(10, "Thanh", 22, "Ha Nam");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("H:\\output2.txt");
            ObjectOutputStream output = new ObjectOutputStream(fileOutputStream);
            output.writeObject(student);

            FileInputStream fileInputStream = new FileInputStream("H:\\output2.txt");
            ObjectInputStream input = new ObjectInputStream(fileInputStream);
            Student s = (Student) input.readObject();

            System.out.println(s.toString());
            output.close();
            input.close();

        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
