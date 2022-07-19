package bai3;

public class BlockC extends Block {
    public BlockC(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public String toString() {
        return "Khoi C : " + "\n" +
                "So bao danh='" + getId() + '\'' +
                ", Ten='" + getName() + '\'' +
                ", Dai chi='" + getAddress() + '\'' +
                ", Muc do uu tien=" + getLevel();
    }
}
