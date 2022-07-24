package bai13;

public class Certificate {
    private String certificatedId;
    private String certificatedName;
    private String certificatedRank;
    private String certificatedDate;

    public Certificate(String certificatedId, String certificatedName, String certificatedRank, String certificatedDate) {
        this.certificatedId = certificatedId;
        this.certificatedName = certificatedName;
        this.certificatedRank = certificatedRank;
        this.certificatedDate = certificatedDate;
    }


    public String getCertificatedId() {
        return certificatedId;
    }

    public void setCertificatedId(String certificatedId) {
        this.certificatedId = certificatedId;
    }

    public String getCertificatedName() {
        return certificatedName;
    }

    public void setCertificatedName(String certificatedName) {
        this.certificatedName = certificatedName;
    }

    public String getCertificatedRank() {
        return certificatedRank;
    }

    public void setCertificatedRank(String certificatedRank) {
        this.certificatedRank = certificatedRank;
    }

    public String getCertificatedDate() {
        return certificatedDate;
    }

    public void setCertificatedDate(String certificatedDate) {
        this.certificatedDate = certificatedDate;
    }
}
