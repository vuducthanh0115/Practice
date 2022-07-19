package bai3;

public class Block {
    private String id;
    private String name;
    private String address;
    private int level;

    public Block(String id, String name, String address, int level) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.level = level;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
