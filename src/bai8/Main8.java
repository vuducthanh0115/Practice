package bai8;

import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager8 manager = new Manager8();
        while (true) {
            System.out.println("""
                    Quan ly
                    1: Them
                    2: Xoa
                    3: Thong tin
                    0: Thoat
                    Nhap lua chon 1->4
                    """);
            String line = scanner.nextLine();
            switch (line) {
                case "1" -> {
                    System.out.print("Ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Tuoi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Truong: ");
                    String school = scanner.nextLine();
                    Student8 student = new Student8(name, age, school);

                    System.out.print("Ma: ");
                    String id = scanner.nextLine();
                    System.out.print("Ngay muon: ");
                    int borrowDate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ngay tra: ");
                    int paymentDate = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Ma sach: ");
                    int bookID = scanner.nextInt();
                    scanner.nextLine();
                    Card card = new Card(student, id, borrowDate, paymentDate, bookID);
                    manager.add(card);
                }
                case "2" -> {
                    System.out.print("Ma: ");
                    String id = scanner.nextLine();
                    System.out.println(manager.delete(id) ? "Thanh cong" : "That bai");
                }
                case "3" -> {
                    manager.showInfo();
                }
                case "0" -> {
                    return;
                }
                default -> {
                    System.out.println("Loi");
                }
            }

        }
    }
}
