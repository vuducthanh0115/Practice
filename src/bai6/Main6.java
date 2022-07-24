package bai6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        School school = new School();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Quan ly
                    1: Them hoc sinh
                    2: Hien thi hoc sinh 20 tuoi
                    3: Hien thi hoc sinh 23 tuoi o DN
                    4: Thoat
                    Nhap lua chon 1->4
                    """);
            String line = scanner.nextLine();
            switch (line) {
                case "1" -> {
                    System.out.print("Ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Tuoi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Que quan: ");
                    String city = scanner.nextLine();
                    System.out.print("Lop: ");
                    int classStudent = scanner.nextInt();
                    scanner.nextLine();
                    Student student = new Student(name, age, city, classStudent);
                    school.add(student);
                }
                case "2" -> school.getStudent20YearOld().forEach(o -> System.out.println(o.toString()));
                case "3" -> {
                    long count = school.countStudent23YearOldInDN();
                    System.out.println(count);
                    //school.showInfo();
                }
                case "4" -> {
                    return;
                }
                default -> System.out.println("Loi");
            }
        }
    }
}
