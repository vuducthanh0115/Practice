package bai13;

import java.util.List;

public class Experience extends Employee {
    private int numberYearsOfExp;
    private String skillName;

    public Experience(String id, String fullName, String birthDate, String phoneNumber, String email, List<Certificate> certificate, int numberYearsOfExp, String skillName) {
        super(id, fullName, birthDate, phoneNumber, email, certificate);
        this.numberYearsOfExp = numberYearsOfExp;
        this.skillName = skillName;
    }

    public int getNumberYearsOfExp() {
        return numberYearsOfExp;
    }

    public void setNumberYearsOfExp(int numberYearsOfExp) {
        this.numberYearsOfExp = numberYearsOfExp;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String showInfo() {
        return "Experience{" +
                "Id = " + getId() +
                ", Ten = " + getFullName() +
                ", Ngay sinh = " + getBirthDate() +
                ", So dien thoai = " + getPhoneNumber() +
                ", Email = " + getEmail() +
                ", So nam kinh nghiem=" + numberYearsOfExp +
                ", Ky nang ='" + skillName + '\'' +
                '}';
    }
}
