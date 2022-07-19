package hasA;

class Student {
    int id;
    String name;
    Address address;
    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("ID : " + id + "\n" + "Name : " + name + "\n" + "City : " + address.city + "\n" + "Province : " + address.province + "\n" + "District : " + address.district);
    }

    public static void main(String[] args) {
        Address address1 = new Address("HN", "KB", "TL");
        Address address2 = new Address("HN1", "KB1", "TL1");
        Student st = new Student(10, "Thanh", address1);
        Student st2 = new Student(11, "Hai", address2);

        st.display();
        System.out.println();
        st2.display();

    }
}
