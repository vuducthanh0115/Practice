package bai9;

public class Customer {
    private String name;
    private String address;
    private String id;


    public Customer(String name, String address, String id) {
        this.name = name;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String toString() {
        return "Ho gia dinh{" +
                "name='" + name + '\'' +
                ", age=" + address +
                ", city='" + id + '\'' +
                '}';
    }
}
