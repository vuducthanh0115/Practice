package bai2;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager2 managerDocument = new Manager2();
        while (true) {
            System.out.println("Quan ly tai lieu");
            System.out.println("1: Them tai lieu");
            System.out.println("2: Tim kiem tai lieu: ");
            System.out.println("3: Thong tin tai lieu");
            System.out.println("4: Xoa tai lieu theo id");
            System.out.println("5: Thoat");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("a: Sach");
                    System.out.println("b: Bao");
                    System.out.println("c: Tap chi");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            System.out.print("ID: ");
                            String id = scanner.nextLine();
                            System.out.print("NXB:");
                            String nxb = scanner.nextLine();
                            System.out.print("SPH: ");
                            int number = scanner.nextInt();
                            System.out.print("TG: ");
                            scanner.nextLine();
                            String author = scanner.nextLine();
                            System.out.print("So trang: ");
                            int pageNumber = scanner.nextInt();
                            Document book = new Book(id, nxb, number, author, pageNumber);
                            managerDocument.addDocument(book);
                            System.out.println(book.toString());
                            scanner.nextLine();
                            break;

                        }
                        case "b": {
                            System.out.print("ID: ");
                            String id = scanner.nextLine();
                            System.out.print("NXB:");
                            String nxb = scanner.nextLine();
                            System.out.print("SPH: ");
                            int number = scanner.nextInt();
                            System.out.print("Ngay PH: ");
                            int dayIssue = scanner.nextInt();
                            Document newspaper = new Newspaper(id, nxb, number, dayIssue);
                            managerDocument.addDocument(newspaper);
                            System.out.println(newspaper.toString());
                            scanner.nextLine();
                            break;
                        }
                        case "c": {
                            System.out.print("ID: ");
                            String id = scanner.nextLine();
                            System.out.print("NXB:");
                            String nxb = scanner.nextLine();
                            System.out.print("SPH: ");
                            int number = scanner.nextInt();
                            System.out.print("S : ");
                            int issueNumber = scanner.nextInt();
                            System.out.print("Thang : ");
                            int issueMonth = scanner.nextInt();
                            Document journal = new Magazine(id, nxb, number, issueNumber, issueMonth);
                            managerDocument.addDocument(journal);
                            System.out.println(journal.toString());
                            scanner.nextLine();
                            break;
                        }
                        default:
                            break;
                    }
                    break;
                }
                case "2": {
                    System.out.println("a: sach");
                    System.out.println("b: bao");
                    System.out.println("c: tap chi");
                    String choise = scanner.nextLine();
                    switch (choise) {
                        case "a": {
                            managerDocument.searchByBook();
                            break;
                        }
                        case "b": {
                            managerDocument.searchByNewspaper();
                            break;
                        }
                        case "c":
                            managerDocument.searchByMagazine();
                            break;
                        default:
                            System.out.println("Loi");
                            break;
                    }
                    break;
                }
                case "3": {
                    managerDocument.showDocument();
                    break;
                }
                case "4": {
                    System.out.print("id: ");
                    String id = scanner.nextLine();
                    System.out.println(managerDocument.deleteDocument(id) ? "Thanh cong" : "Loi");
                }
                break;
                case "5": {
                    return;
                }
                default:
                    System.out.println("Loi");
                    continue;
            }

        }
    }
}
