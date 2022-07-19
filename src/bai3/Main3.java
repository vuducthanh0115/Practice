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
            System.out.println("Quan ly ");
            System.out.println("1: Them moi thi sinh");
            System.out.println("2: Thong tin thi sinh ");
            System.out.println("3: Tim kiem thi sinh theo SBD");
            System.out.println("4: Thoat");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.println("a: Them thi sinh khoi A");
                    System.out.println("b: Them thi sinh khoi B");
                    System.out.println("c: Them thi sinh khoi C");
                    String type = scanner.nextLine();
                    switch (type) {
                        case "a": {
                            managerBlock.add(createStudent(scanner, "a"));
                            break;

                        }
                        case "b": {
                            managerBlock.add(createStudent(scanner, "b"));
                            break;
                        }
                        case "c": {
                            managerBlock.add(createStudent(scanner, "c"));
                            break;
                        }
                        default:
                            System.out.println("Loi");
                            break;
                    }
                    break;
                }
                case "2": {
                    managerBlock.showInfor();
                    break;
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
                    continue;
            }

        }
    }
}
