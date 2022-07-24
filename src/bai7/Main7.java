package bai7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        while (true) {
            System.out.println("""
                    Quan ly
                    1: Them GV
                    2: Xoa GV theo ma
                    3: Luong GV theo id
                    4: Thoat
                    Nhap lua chon 1->4
                    """);
            String line = scanner.nextLine();
            switch (line) {
                case "1" -> {
                    System.out.print("Luong cung: ");
                    double basicSalary = scanner.nextDouble();
                    System.out.print("Luong thuong: ");
                    double bonus = scanner.nextDouble();
                    System.out.print("Tien phat: ");
                    double fine = scanner.nextDouble();
                    System.out.print("Luong thuc linh: ");
                    double realSalary = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Tuoi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    Teacher teacher = new Teacher(basicSalary, bonus, fine, realSalary, name, age, city, id);
                    manager.add(teacher);
                }
                case "2" -> {
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    manager.deleteById(id);
                }
                case "3" -> {
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    Double salary = manager.getSalary(id);
                    System.out.println(salary);
                }
                case "4" -> {
                    return;
                }
                default -> {
                    System.out.println("Loi");
                }
            }
        }
    }

}
