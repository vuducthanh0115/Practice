package bai13;

import java.util.List;

public class Fresher extends Employee {
    private String graduationDate;
    private String graduationRank;
    private String universityName;

    public Fresher(String id, String fullName, String birthDate, String phoneNumber, String email, List<Certificate> certificate, String graduationDate, String graduationRank, String universityName) {
        super(id, fullName, birthDate, phoneNumber, email, certificate);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.universityName = universityName;
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String showInfo() {
        return "Fresher{" +
                "Id = " + getId() +
                ", Ten = " + getFullName() +
                ", Ngay sinh = " + getBirthDate() +
                ", So dien thoai = " + getPhoneNumber() +
                ", Email = " + getEmail() +
                ", Ngay tot nghiep=" + graduationDate +
                ", Tot nghiep loai='" + graduationRank + '\'' +
                ", Truong tot nghiep='" + universityName + '\'' +
                '}';
    }

}
