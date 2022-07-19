package bai6;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        School school = new School();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Quan ly");
            System.out.println("1: Them hoc sinh");
            System.out.println("2: Hien thi hoc sinh 20 tuoi");
            System.out.println("3: Hien thi hoc sinh 23 tuoi o DN");
            System.out.println("4: Thoat");
            System.out.print("Nhap lua chon 1->4 :");
            String line = scanner.nextLine();
            switch (line) {
                case "1": {
                    System.out.print("Ten: ");
                    String name = scanner.nextLine();
                    System.out.print("Tuoi: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("City: ");
                    String city = scanner.nextLine();
                    System.out.print("Class: ");
                    int classStudent = scanner.nextInt();
                    scanner.nextLine();
                    Student student = new Student(name, age, city, classStudent);
                    school.add(student);
                    break;
                }
                case "2": {
                    school.getStudent20YearOld().forEach(o -> System.out.println(o.toString()));
                    break;
                }
                case "3": {
                    long count = school.countStudent23YearOldInDN();
                    System.out.println(count);
                    //school.showInfo();
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


        // add Student to school by func add(). for ex: school.add(new Student(// infor);


    }
}
