package bai9;

import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager9 manager = new Manager9();
        while (true) {
            System.out.println("Quan ly");
            System.out.println("1: Them");
            System.out.println("2: Xoa");
            System.out.println("3: Thong tin");
            System.out.println("4: Thoat");
            System.out.print("Nhap lua chon 1->4 :");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Dia chi: ");
                    String address = scanner.nextLine();
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    Customer customer = new Customer(name, address, id);

                    System.out.print("So cu: ");
                    int oldId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("So moi: ");
                    int newId = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("So tien phai tra: ");
                    double paymentMoney = scanner.nextDouble();
                    scanner.nextLine();

                    Receipt receipt = new Receipt(oldId, newId, paymentMoney, customer);
                    manager.add(receipt);
                    break;
                }
                case "2": {
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    System.out.println(manager.delete(id) ? "Thanh cong" : "That bai");
                    break;
                }
                case "3": {
                    manager.showInfo();
                    break;
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Loi");
                    continue;
            }

        }
    }

}