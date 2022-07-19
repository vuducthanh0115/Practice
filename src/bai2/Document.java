package bai2;

public class Document {
    private String id;
    private String nameNXB;
    private int numberBPH;

    public Document(String id, String nameNXB, int numberBPH) {
        this.id = id;
        this.nameNXB = nameNXB;
        this.numberBPH = numberBPH;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNameNXB() {
        return nameNXB;
    }

    public void setNameNXB(String nameNXB) {
        this.nameNXB = nameNXB;
    }

    public int getNumberBPH() {
        return numberBPH;
    }

    public void setNumberBPH(int numberBPH) {
        this.numberBPH = numberBPH;
    }
}
