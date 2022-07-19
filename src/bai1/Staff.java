package bai1;

public class Staff extends Officer {
    Staff(String name, int old, String gender, String address, String level) {
        super(name, old, gender, address, level);
    }

    public String toString() {
        return "Thong tin" + "\n" + "Tuoi : " + getName() + " - " + "Tuoi : " + getOld() + " - " + "Gioi tinh: " + getGender() + " - " + "Dia chi : " + getAddress() + " - " + "Cap do: " + getLevel() + "\n";
    }
}
