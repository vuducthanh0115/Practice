package accessmodifier;

public class Student {
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
    void display(int id, String name){
        System.out.println("Id : " + id + "\n" + "Name : " + name);
    }

    public static void main(String[] args) {
        Student st = new Student(10, "Thanh");
        st.display(st.id, st.name);
    }
}
