package bai4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Town town = new Town();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n:");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Xin moi nhap ho so " + (++i));
            System.out.println("Dia chi:");
            scanner.nextLine();
            String address = scanner.nextLine();

            List<People> persons = new ArrayList<>();
            System.out.println("So thanh vien");
            int number = scanner.nextInt();
            scanner.nextLine();

            for (int j = 0; j < number; j++) {
                System.out.print("Ten : ");
                String name = scanner.nextLine();
                System.out.print("Tuoi : ");
                int age = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Cong viec : ");
                String job = scanner.nextLine();
                System.out.print("CCCD : ");
                String passport = scanner.nextLine();
                People people = new People(name, age, job, passport);
                persons.add(people);
            }

            town.addFamily(new Family(persons, address));
            town.showInfor();


        }
    }
}
