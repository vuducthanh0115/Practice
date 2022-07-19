import java.io.*;

class Person implements Serializable {
    private String name;
    private int age;
    private String gender;

    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Name:" + name + "\nAge: " + age + "\nGender: " + gender;
    }
}

class Main {
    public static void main(String[] args) {
        //Tạo đối tượng của lớp Person
        Person p1 = new Person("John", 30, "Male");
        Person p2 = new Person("Rachel", 25, "Female");
        try {
            FileOutputStream file = new FileOutputStream("D:\\output.txt");
            //Tạo ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);
            //Ghi đối tượng Person đến output stream
            output.writeObject(p1);
            output.writeObject(p2);
            FileInputStream fileStream = new FileInputStream("D:\\output.txt");
            //Tạo ObjectInputStream
            ObjectInputStream input = new ObjectInputStream(fileStream);
            //Đọc đối tượng Person
            Person pr1 = (Person) input.readObject();
            Person pr2 = (Person) input.readObject();
            System.out.println(pr1.toString());
            System.out.println(pr2.toString());
            output.close();
            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}