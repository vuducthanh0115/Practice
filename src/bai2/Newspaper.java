package bai2;

public class Newspaper extends Document {
    private int dayPH;

    public Newspaper(String id, String nameNXB, int numberBPH, int dayPH) {
        super(id, nameNXB, numberBPH);
        this.dayPH = dayPH;
    }

    public int getDayPH() {
        return dayPH;
    }

    public void setDayPH(int dayPH) {
        this.dayPH = dayPH;
    }

    public String toString() {
        return "Newspaper{" + "dayIssue=" + dayPH + ", id='" + getId() + '\'' + ", nxb='" + getNameNXB() + '\'' + ", number='" + getNumberBPH() + '\'' + '}';
    }
}
