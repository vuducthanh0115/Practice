package bai13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main13 {
    public static Employee createEmploy(Scanner scanner, int type) throws FullNameException {
        boolean check;
        boolean checkName;
        System.out.print("Id : ");
        String id = scanner.nextLine();
        String fullName;
        System.out.print("Họ và tên : ");
        do {

            fullName = scanner.nextLine();
            if (!Validator.nameCheck(fullName)) {
                System.out.print("Họ và tên : ");
                checkName = false;
            } else {
                checkName = true;
            }
        } while (!checkName);

        String birthDate;
        do {
            String regexBirthDate = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
            System.out.print("Ngày sinh YYYY-MM-DD : ");
            birthDate = scanner.nextLine();
            check = birthDate.matches(regexBirthDate);
            if (!check) System.out.print("Sai định dạng. Mời nhập lại - ");
        } while (!check);
        String phoneNumber;
        do {
            String regexPhone = "^(?:0|\\+84)[0-9]{8,9}$";
            System.out.print("Số điện thoại : ");
            phoneNumber = scanner.nextLine();
            check = phoneNumber.matches(regexPhone);
            if (!check) System.out.print("Sai định dạng. Mời nhập lại - ");
        } while (!check);
        String email;
        do {
            String regexEmail = "^\\S+@\\S+\\.\\S+$";
            System.out.print("Email : ");
            email = scanner.nextLine();
            check = email.matches(regexEmail);
            if (!check) System.out.print("Sai định dạng. Mời nhập lại - ");
        } while (!check);


        System.out.println("----------Bằng cấp-----------");
        List<Certificate> certificates = new ArrayList<>();
        System.out.print("Id bằng ");
        String certificateId = scanner.nextLine();
        System.out.print("Tên bằng ");
        String certificateName = scanner.nextLine();
        System.out.print("Lo?i bằng ");
        String certificateRank = scanner.nextLine();
        System.out.print("Năm cấp ");
        String certificateDate = scanner.nextLine();
        Certificate certificate = new Certificate(certificateId, certificateName, certificateRank, certificateDate);
        certificates.add(certificate);
        if (type == 0) {
            System.out.print("Số năm kinh nghiệm : ");
            int numberYearsOfExp = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Kỹ năng : ");
            String skillName = scanner.nextLine();
            return new Experience(id, fullName, birthDate, phoneNumber, email, certificates, numberYearsOfExp, skillName);
        } else if (type == 1) {
            System.out.print("Ngày t?t nghi?p : ");
            String graduationDate = scanner.nextLine();
            System.out.print("T?t nghi?p lo?i : ");
            String graduationRank = scanner.nextLine();
            System.out.print("T?t nghi?p tr??ng : ");
            String universityName = scanner.nextLine();
            return new Fresher(id, fullName, birthDate, phoneNumber, email, certificates, graduationDate, graduationRank, universityName);
        } else {
            System.out.print("Ngành ?ang theo h?c : ");
            String majors = scanner.nextLine();
            System.out.print("H?c k? : ");
            int semester = scanner.nextInt();
            scanner.nextLine();
            System.out.print("T?t nghi?p tr??ng : ");
            String universityName = scanner.nextLine();
            return new Intern(id, fullName, birthDate, phoneNumber, email, certificates, majors, semester, universityName);
        }
    }

    public static void main(String[] args) throws FullNameException {
        Scanner scanner = new Scanner(System.in);
        ManagerEmployee manager = new ManagerEmployee();
        int chose;
        while (true) {
            System.out.println("""
                    1.Thêm nhân viên
                    2.Thông tin tất cả nhân viên
                    3.Sửa nhân viên
                    4.Xoá nhân viên theo ID
                    5.Tìm kiếmm nhân viên theo ID
                    0.Thoát""");
            System.out.print("Nhập lựa chọn 0->5: ");
            chose = scanner.nextInt();
            scanner.nextLine();
            switch (chose) {
                case 1 -> {
                    System.out.println("""
                            0.Experience
                            1.Fresher
                            2.Intern
                            -1.Thoát""");
                    System.out.print("Mời bạn nhập lựa chọn 0->2: ");
                    int choseStaff = scanner.nextInt();
                    scanner.nextLine();
                    switch (choseStaff) {
                        case 0 -> manager.insertEmployee(createEmploy(scanner, 0));
                        case 1 -> manager.insertEmployee(createEmploy(scanner, 1));
                        case 2 -> manager.insertEmployee(createEmploy(scanner, 2));
                        case -1 -> {
                            return;
                        }
                        default -> System.out.println("Xin m?i nh?p l?i");
                    }

                }
                case 2 -> manager.showInfoE();
                case 3 -> {
                    System.out.println("Nh?p ID c?a nhân viên mu?n s?a : ");
                    String id = scanner.nextLine();
                    if (manager.searchId(id)) {
                        System.out.print("H? và tên : ");
                        String fullName = scanner.nextLine();
                        boolean check;
                        String birthDate;
                        do {
                            String regexBirthDate = "([12]\\d{3}-(0[1-9]|1[0-2])-(0[1-9]|[12]\\d|3[01]))";
                            System.out.print("Ngày sinh YYYY-MM-DD : ");
                            birthDate = scanner.nextLine();
                            check = birthDate.matches(regexBirthDate);
                            if (!check) System.out.print("Sai định dạng. Mời nhập lại - ");
                        } while (!check);
                        String phoneNumber;
                        do {
                            String regexPhone = "^(?:0|\\+84)[0-9]{8,9}$";
                            System.out.print("Số điện thoại : ");
                            phoneNumber = scanner.nextLine();
                            check = phoneNumber.matches(regexPhone);
                            if (!check) System.out.print("Sai định dạng. Mời nhập lại - ");
                        } while (!check);
                        String email;
                        do {
                            String regexEmail = "^\\S+@\\S+\\.\\S+$";
                            System.out.print("Email : ");
                            email = scanner.nextLine();
                            check = email.matches(regexEmail);
                            if (!check) System.out.print("Sai định dạng. Mời nhập lại - ");
                        } while (!check);
                        manager.update(id, fullName, birthDate, phoneNumber, email);
                    } else {
                        System.out.println("Không t?n t?i ID này");
                    }

                }
                case 4 -> {
                    System.out.println("Nh?p ID c?a nhân viên mu?n xoá : ");
                    String id = scanner.nextLine();
                    System.out.println(manager.delete(id) ? "Xoá thành công" : "Xoá th?t b?i, do không tông t?i ID này");
                }
                case 5 -> {
                    System.out.println("""
                            1.Experience
                            2.Fresher
                            3.Intern
                            0.Thoat""");
                    System.out.print("L?a ch?n lo?i nhân viên mu?n xem thông tin 1->3: ");
                    String typeStaff = scanner.nextLine();
                    switch (typeStaff) {
                        case "1" -> manager.searchExperience();
                        case "2" -> manager.searchFresher();
                        case "3" -> manager.searchIntern();
                        case "0" -> {
                            return;
                        }
                        default -> System.out.println("Hãy nh?p ?úng l?a ch?n");
                    }

                }
                case 0 -> {
                    return;
                }
                default -> System.out.println("Xin m?i nh?p l?i ?úng các l?a ch?n bên trên");
            }
        }

    }
}
