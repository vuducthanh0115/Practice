package bai5;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel hotel = new Hotel();
        while (true) {
            System.out.println("""
                    Quan ly
                    1: Them khach
                    2: Xoa khach theo CCCD
                    3: Tinh tien theo CCCD
                    4: Thong tin khach
                    0: Thoat
                    Nhap lua chon 1->5""");
            String line = scanner.nextLine();
            switch (line) {
                case "1" -> {
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
                }
                case "2" -> {
                    System.out.print("CCCD: ");
                    String passport = scanner.nextLine();
                    hotel.delete(passport);
                }
                case "3" -> {
                    System.out.print("CCCD: ");
                    String passport = scanner.nextLine();
                    System.out.println("Tien: " + hotel.calculator(passport));
                }
                case "4" -> hotel.show();
                case "0" -> {
                    return;
                }
                default -> System.out.println("Loi");
            }
        }

    }
}
