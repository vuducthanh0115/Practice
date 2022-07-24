package bai1;

import java.util.Scanner;

public class Main1 {
    public static Officer createOfficer(Scanner scanner, String type) {
        System.out.print("Ten : ");
        String name = scanner.nextLine();
        System.out.print("Tuoi : ");
        int old = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Gioi tinh : ");
        String gender = scanner.nextLine();
        System.out.print("Dia chi : ");
        String address = scanner.nextLine();
        System.out.print("Cap bac : ");
        String level = scanner.nextLine();
        if (type.equals("a")) {
            return new Engineer(name, old, gender, address, level);
        } else if (type.equals("b")) {
            return new Staff(name, old, gender, address, level);
        } else {
            return new Worker(name, old, gender, address, level);
        }
    }

    public static void main(String[] args) {
        Manager1 manager1 = new Manager1();

        Scanner scanner = new Scanner(System.in);
        int chose = 9999;
        while (chose > 0) {
            System.out.println("""
                    1.Them moi can bo
                    2.Tim kiem can bo theo tem
                    3.Danh sach can bo
                    0.Thoat""");
            System.out.print("Lua chon : ");
            chose = scanner.nextInt();
            scanner.nextLine();

            switch (chose) {
                case 1 -> {
                    System.out.println("""
                            a.Them Nhan Vien
                            b.Them Ky Su
                            c.Them Cong Nhan""");
                    System.out.print("Lua chon them can bo :");
                    String choseOfficer = scanner.nextLine();
                    switch (choseOfficer) {
                        case "a" -> manager1.add(createOfficer(scanner, "a"));
                        case "b" -> manager1.add(createOfficer(scanner, "b"));
                        case "c" -> manager1.add(createOfficer(scanner, "c"));
                        default -> System.out.println("Xin moi nhap lai");
                    }
                }
                case 2 -> {
                    System.out.print("Tim kiem theo ten : ");
                    String name = scanner.nextLine();
                    //manager1.search(name);
                    //manager1.search(name).forEach(o -> System.out.println(o.toString()));
                    manager1.search(name).forEach(System.out::println);
                }
                case 3 -> manager1.showInfo();
                case 0 -> {
                }
                default -> System.out.println("Loi");
            }
        }
    }
}
