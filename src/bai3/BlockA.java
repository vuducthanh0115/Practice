package bai3;

public class BlockA extends Block {
    public BlockA(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public String toString() {
        return "Khoi A : " + "\n" +
                "So bao danh='" + getId() + '\'' +
                ", Ten='" + getName() + '\'' +
                ", Dai chi='" + getAddress() + '\'' +
                ", Muc do uu tien=" + getLevel();
    }
}
