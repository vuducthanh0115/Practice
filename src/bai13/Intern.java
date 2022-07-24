package bai13;

import java.util.List;

public class Intern extends Employee {
    private String majors;
    private int semester;
    private String universityName;

    public Intern(String id, String fullName, String birthDate, String phoneNumber, String email, List<Certificate> certificate, String majors, int semester, String universityName) {
        super(id, fullName, birthDate, phoneNumber, email, certificate);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String showInfo() {
        return "Intern{" +
                "Id = " + getId() +
                ", Ten = " + getFullName() +
                ", Ngay sinh = " + getBirthDate() +
                ", So dien thoai = " + getPhoneNumber() +
                ", Email = " + getEmail() +
                ", Nganh dang theo hoc='" + majors + '\'' +
                ", Hoc ky=" + semester +
                ", Truong dang hoc='" + universityName + '\'' +
                '}';
    }
}
