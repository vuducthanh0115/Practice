package bai7;

public class Teacher {
    private double basicSalary;
    private double bonus;
    private double fine;
    private double realSalary;
    private String name;
    private int age;
    private String city;
    private String id;


    public Teacher(double basicSalary, double bonus, double fine, double realSalary, String name, int age, String city, String id) {
        this.basicSalary = basicSalary;
        this.bonus = bonus;
        this.fine = fine;
        this.realSalary = realSalary;
        this.name = name;
        this.age = age;
        this.city = city;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalary() {
        return basicSalary;
    }

    public void setSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getRealSalary() {
        return realSalary;
    }

    public void setRealSalary(double realSalary) {
        this.realSalary = realSalary;
    }
}
