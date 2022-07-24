package bai13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main13 {
    public static Employee createEmploy(Scanner scanner, String type) {
        boolean check = true;
        System.out.print("Id : ");
        String id = scanner.nextLine();
        System.out.print("Ten : ");
        String fullName = scanner.nextLine();

        String birthDate;
        do {
            String regexBirthDate = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
            System.out.print("Ngay sinh YYYY-MM-DD : ");
            birthDate = scanner.nextLine();
            check = birthDate.matches(regexBirthDate);
            if (!check) System.out.print("Sai dinh dang. Moi nhap lai - ");
        } while (!check);
        String phoneNumber;
        do {
            String regexPhone = "^(?:0|\\+84)[0-9]{8,9}$";
            System.out.print("So dien thoai : ");
            phoneNumber = scanner.nextLine();
            check = phoneNumber.matches(regexPhone);
            if (!check) System.out.print("Sai dinh dang. Moi nhap lai - ");
        } while (!check);
        String email;
        do {
            String regexEmail = "^\\S+@\\S+\\.\\S+$";
            System.out.print("Email : ");
            email = scanner.nextLine();
            check = email.matches(regexEmail);
            if (!check) System.out.print("Sai dinh dang. Moi nhap lai - ");
        } while (!check);


        System.out.println("----------Certificate-----------");
        List<Certificate> certificates = new ArrayList<>();
        System.out.print("CertificateId ");
        String certificateId = scanner.nextLine();
        System.out.print("CertificateName ");
        String certificateName = scanner.nextLine();
        System.out.print("CertificateRank ");
        String certificateRank = scanner.nextLine();
        System.out.print("CertificateDate ");
        String certificateDate = scanner.nextLine();
        Certificate certificate = new Certificate(certificateId, certificateName, certificateRank, certificateDate);
        certificates.add(certificate);
        if (type.equals("a")) {
            System.out.print("So nam kinh nghiem : ");
            int numberYearsOfExp = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Ky nang : ");
            String skillName = scanner.nextLine();
            return new Experience(id, fullName, birthDate, phoneNumber, email, certificates, numberYearsOfExp, skillName);
        } else if (type.equals("b")) {
            System.out.print("Ngay tot nghiep : ");
            String graduationDate = scanner.nextLine();
            System.out.print("Tot nghiep loai : ");
            String graduationRank = scanner.nextLine();
            System.out.print("Tot nghiep truong : ");
            String universityName = scanner.nextLine();
            return new Fresher(id, fullName, birthDate, phoneNumber, email, certificates, graduationDate, graduationRank, universityName);
        } else {
            System.out.print("Nganh dang theo hoc : ");
            String majors = scanner.nextLine();
            System.out.print("Hoc ky : ");
            int semester = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Tot nghiep truong : ");
            String universityName = scanner.nextLine();
            return new Intern(id, fullName, birthDate, phoneNumber, email, certificates, majors, semester, universityName);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ManagerEmployee manager = new ManagerEmployee();
        int chose;
        while (true) {
            System.out.println("""
                    1.Them nhan vien
                    2.Thong tin tat ca nhan vien
                    3.Sua nhan vien
                    4.Xoa nhan vien theo id
                    5.Tim kiem nhan vien theo loai
                    0.Thoat""");
            System.out.print("Lua chon : ");
            chose = scanner.nextInt();
            scanner.nextLine();
            switch (chose) {
                case 1 -> {
                    System.out.println("""
                            a.Experience
                            b.Fresher
                            c.Intern
                            d.Thoat""");
                    System.out.print("Lua chon them loai nhan vien : ");
                    String choseStaff = scanner.nextLine();
                    switch (choseStaff) {
                        case "a" -> manager.insertEmployee(createEmploy(scanner, "a"));
                        case "b" -> manager.insertEmployee(createEmploy(scanner, "b"));
                        case "c" -> manager.insertEmployee(createEmploy(scanner, "c"));
                        case "d" -> {
                            return;
                        }
                        default -> System.out.println("Xin moi nhap lai");
                    }
                }
                case 2 -> {
                    manager.showInfoE();
                }
                case 3 -> {
                    System.out.println("Nhap ID cua nhan vien muon sua : ");
                    String id = scanner.nextLine();
                    if (manager.searchId(id)) {
                        System.out.print("Ten : ");
                        String fullName = scanner.nextLine();
                        boolean check = true;
                        String birthDate;
                        do {
                            String regexBirthDate = "/([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))/";
                            System.out.print("Ngay sinh YYYY-MM-DD : ");
                            birthDate = scanner.nextLine();
                            check = birthDate.matches(regexBirthDate);
                            if (!check) System.out.print("Sai dinh dang. Moi nhap lai - ");
                        } while (!check);
                        String phoneNumber;
                        do {
                            String regexPhone = "^(?:0|\\+84)[0-9]{8,9}$";
                            System.out.print("So dien thoai : ");
                            phoneNumber = scanner.nextLine();
                            check = phoneNumber.matches(regexPhone);
                            if (!check) System.out.print("Sai dinh dang. Moi nhap lai - ");
                        } while (!check);
                        String email;
                        do {
                            String regexEmail = "^\\S+@\\S+\\.\\S+$";
                            System.out.print("Email : ");
                            email = scanner.nextLine();
                            check = email.matches(regexEmail);
                            if (!check) System.out.print("Sai dinh dang. Moi nhap lai - ");
                        } while (!check);
                        manager.update(id, fullName, birthDate, phoneNumber, email);
                    } else {
                        System.out.println("Khong ton tai id nay");
                    }

                }
                case 4 -> {
                    System.out.println("Nhap ID cua nhan vien muon xoa : ");
                    String id = scanner.nextLine();
                    System.out.println(manager.delete(id) ? "Xoa thanh cong" : "That bai do khong ton tai id nay");
                }
                case 5 -> {
                    System.out.println("""
                            1.Experience
                            2.Fresher
                            3.Intern
                            0.Thoat""");
                    System.out.print("Lua chon loai nhan vien: ");
                    String typeStaff = scanner.nextLine();
                    switch (typeStaff) {
                        case "1" -> manager.searchExperience();
                        case "2" -> manager.searchFresher();
                        case "3" -> manager.searchIntern();
                        case "0" -> {
                            return;
                        }
                        default -> System.out.println("Hay nhap dung lua chon");
                    }

                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Xin moi nhập lại dung cac lua chon ben tren");
            }
        }

    }
}
