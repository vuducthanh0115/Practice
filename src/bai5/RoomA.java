package bai5;

public class RoomA extends Room {

    public RoomA() {
        super("A", 500);
    }

    public String toString() {
        return "RoomA{" +
                "category='" + category + '\'' +
                ", price=" + price +
                '}';
    }
}
