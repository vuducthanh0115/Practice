package bai2;

public class Magazine extends Document {
    private int issueNumber;
    private int releaseMonth;

    public Magazine(String id, String nameNXB, int numberBPH, int issueNumber, int releaseMonth) {
        super(id, nameNXB, numberBPH);
        this.issueNumber = issueNumber;
        this.releaseMonth = releaseMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getReleaseMonth() {
        return releaseMonth;
    }

    public void setReleaseMonth(int releaseMonth) {
        this.releaseMonth = releaseMonth;
    }

    public String toString() {
        return "Journal :" + "\n" +
                "issueNumber=" + issueNumber +
                ", monthIssue=" + releaseMonth +
                ", id='" + getId() + '\'' +
                ", nxb='" + getNameNXB() + '\'' +
                ", number='" + getIssueNumber() + '\'' +
                '}';
    }
}
