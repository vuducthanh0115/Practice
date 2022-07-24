package bai3;

import java.util.Scanner;

public class Main3 {

    public static Block createStudent(Scanner scanner, String block) {
        System.out.print("So bao danh: ");
        String id = scanner.nextLine();
        System.out.print("Ten: ");
        String name = scanner.nextLine();
        System.out.print("Dia chi: ");
        String address = scanner.nextLine();
        System.out.print("Muc do uu tien: ");
        int priority = scanner.nextInt();
        scanner.nextLine();
        if (block.equals("a")) {
            return new BlockA(id, name, address, priority);
        } else if (block.equals("b")) {
            return new BlockB(id, name, address, priority);
        } else {
            return new BlockC(id, name, address, priority);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager3 managerBlock = new Manager3();
        while (true) {
            System.out.println("""
                    Quan ly
                    1: Them thi sinh
                    2: Thong tin thi sinh
                    3: Tim kiem thi sinh theo SBD
                    4: Thoat""");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("""
                            b: Them thi sinh khoi B
                            c: Them thi sinh khoi C
                            a: Them thi sinh khoi A""");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a" -> managerBlock.add(createStudent(scanner, "a"));
                        case "b" -> managerBlock.add(createStudent(scanner, "b"));
                        case "c" -> managerBlock.add(createStudent(scanner, "c"));
                        default -> System.out.println("Loi");
                    }
                }
                case "2": {
                    managerBlock.showInfor();
                }
                case "3": {
                    System.out.print("SBD: ");
                    String id = scanner.nextLine();
                    managerBlock.searchId(id);
                }
                case "4": {
                    return;
                }
                default:
                    System.out.println("Loi");
            }

        }
    }
}
