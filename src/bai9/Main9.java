package bai9;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager9 manager = new Manager9();
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
                    System.out.print("Dia chi: ");
                    String address = scanner.nextLine();
                    System.out.print("Ma: ");
                    String id = scanner.nextLine();
                    Customer customer = new Customer(name, address, id);

                    System.out.print("So cu: ");
                    int oldId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("So moi: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine();

                    Receipt receipt = new Receipt(oldId, newId, customer);
                    manager.add(receipt);
                }
                case "2" -> {
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    System.out.println(manager.delete(id) ? "Thanh cong" : "That bai");
                }
                case "3" -> manager.showInfo();
                case "0" -> {
                    return;
                }
                default -> System.out.println("Loi");
            }

        }
    }

}