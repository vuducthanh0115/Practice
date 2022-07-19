package bai7;

import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Manager manager = new Manager();
        while (true) {
            System.out.println("Quan ly");
            System.out.println("1: Them GV");
            System.out.println("2: Xoa GV theo ma");
            System.out.println("3: Luong GV theo id");
            System.out.println("4: Thoat");
            System.out.print("Nhap lua chon 1->4 :");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Luong cung: ");
                    Double basicSalary = scanner.nextDouble();
                    System.out.print("Luong thuong: ");
                    Double bonus = scanner.nextDouble();
                    System.out.print("Tien phat: ");
                    Double fine = scanner.nextDouble();
                    System.out.print("Luong thuc linh: ");
                    Double realSalary = scanner.nextDouble();
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
                    break;
                }
                case "2": {
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    manager.deleteById(id);
                    break;
                }
                case "3": {
                    System.out.print("Id: ");
                    String id = scanner.nextLine();
                    Double salary = manager.getSalary(id);
                    System.out.println(salary);
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
