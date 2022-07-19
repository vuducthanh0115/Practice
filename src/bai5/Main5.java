package bai5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true) {
            System.out.println("Quan ly");
            System.out.println("1: Them khach");
            System.out.println("2: Xoa khach theo CCCD");
            System.out.println("3: Tinh tien theo CCCD");
            System.out.println("4: Thong tin khach");
            System.out.println("5: Thoat");
            System.out.print("Nhap lua chon 1->5 :");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Tuoi: ");
                    int age = scanner.nextInt();
                    System.out.print("CCCD: ");
                    scanner.nextLine();
                    String passport = scanner.nextLine();
                    System.out.println("a: A");
                    System.out.println("b: B");
                    System.out.println("c: C");
                    String option = scanner.nextLine();
                    Room room;
                    if (option.equals("a")) {
                        room = new RoomA();
                    } else if (option.equals("b")) {
                        room = new RoomB();
                    } else if (option.equals("c")) {
                        room = new RoomC();
                    } else {
                        continue;
                    }
                    System.out.print("So ngay thue: ");
                    int numberRent = scanner.nextInt();
                    Person person = new Person(name, age, passport, room, numberRent);
                    hotel.add(person);
                    scanner.nextLine();
                    break;
                }
                case "2": {
                    System.out.print("CCCD: ");
                    String passport = scanner.nextLine();
                    hotel.delete(passport);
                    break;
                }
                case "3": {
                    System.out.print("CCCD: ");
                    String passport = scanner.nextLine();
                    System.out.println("Tien: " + hotel.calculator(passport));
                    break;
                }
                case "4": {
                    hotel.show();
                    break;
                }
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
