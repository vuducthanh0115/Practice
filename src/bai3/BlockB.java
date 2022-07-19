package bai3;

public class BlockB extends Block {
    public BlockB(String id, String name, String address, int priority) {
        super(id, name, address, priority);
    }

    public String toString() {
        return "Khoi B : " + "\n" +
                "So bao danh='" + getId() + '\'' +
                ", Ten='" + getName() + '\'' +
                ", Dai chi='" + getAddress() + '\'' +
                ", Muc do uu tien=" + getLevel();
    }
}
