package bai4;

import java.util.ArrayList;
import java.util.List;

public class Family {
    private List<People> people = new ArrayList<>();
    private String address;

    public Family(List<People> people, String address) {
        this.people = people;
        this.address = address;
    }

    public List<People> getPresons() {
        return people;
    }

    public void setPresons(List<People> people) {
        this.people = people;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return "Family " +
                "people=" + people +
                ", address='" + address + '\'';
    }
}
