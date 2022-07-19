package IO;

import java.io.Serializable;

class Student implements Serializable {
    private int id;
    private String name;
    private int age;
    private String city;

    Student(int id, String name, int age, String city) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Id: " + id + "\n" + "Name: " + name + "\n" + "Age: " + age + "\n" + "City: " + city;
    }
}
