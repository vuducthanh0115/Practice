package bai2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager2 managerDocument = new Manager2();
        while (true) {
            System.out.println("""
                    Quan ly tai lieu
                    1: Them tai lieu
                    2: Tim kiem tai lieu
                    3: Thong tin tai lieu
                    4: Xoa tai lieu theo id
                    0: Thoat""");
            String line = scanner.nextLine();
            switch (line) {
                case "1" -> {
                    System.out.println("""
                            a: Sach
                            b: Bao
                            c: Tap chi""");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a" -> {
                            System.out.print("Ma : ");
                            String id = scanner.nextLine();
                            System.out.print("Nha xuat ban: ");
                            String nxb = scanner.nextLine();
                            System.out.print("So ban phat hanh: ");
                            int number = scanner.nextInt();
                            System.out.print("Tac gia: ");
                            scanner.nextLine();
                            String author = scanner.nextLine();
                            System.out.print("So trang: ");
                            int pageNumber = scanner.nextInt();
                            Document book = new Book(id, nxb, number, author, pageNumber);
                            managerDocument.addDocument(book);
                            System.out.println(book.toString());
                            scanner.nextLine();

                        }
                        case "b" -> {
                            System.out.print("Ma: ");
                            String id = scanner.nextLine();
                            System.out.print("Nha xuat ban:");
                            String nxb = scanner.nextLine();
                            System.out.print("So ban phat hanh: ");
                            int number = scanner.nextInt();
                            System.out.print("Ngay phat hanh: ");
                            int dayIssue = scanner.nextInt();
                            Document newspaper = new Newspaper(id, nxb, number, dayIssue);
                            managerDocument.addDocument(newspaper);
                            System.out.println(newspaper);
                            scanner.nextLine();
                        }
                        case "c" -> {
                            System.out.print("Ma: ");
                            String id = scanner.nextLine();
                            System.out.print("Nha xuat ban:");
                            String nxb = scanner.nextLine();
                            System.out.print("So ban phat hanh: ");
                            int number = scanner.nextInt();
                            System.out.print("So phat hanh : ");
                            int issueNumber = scanner.nextInt();
                            System.out.print("Thang phat hanh : ");
                            int issueMonth = scanner.nextInt();
                            Document magazine = new Magazine(id, nxb, number, issueNumber, issueMonth);
                            managerDocument.addDocument(magazine);
                            System.out.println(magazine);
                            scanner.nextLine();
                        }
                        default -> {
                        }
                    }
                }
                case "2" -> {
                    System.out.println("a: Sach");
                    System.out.println("b: Bao");
                    System.out.println("c: Tap chi");
                    String chose = scanner.nextLine();
                    switch (chose) {
                        case "a" -> managerDocument.searchByBook();
                        case "b" -> managerDocument.searchByNewspaper();
                        case "c" -> managerDocument.searchByMagazine();
                        default -> System.out.println("Moi nhap dung lua chon");
                    }
                }
                case "3" -> managerDocument.showDocument();
                case "4" -> {
                    System.out.print("id: ");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id) ? "Thanh cong" : "Loi");
                }
                case "0" -> {
                    return;
                }
                default -> System.out.println("Moi nhap dung lua chon");
            }

        }
    }
}
