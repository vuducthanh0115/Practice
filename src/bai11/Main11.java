package bai11;

import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Complex complex1 = new Complex();
        Complex complex2 = new Complex();
        Complex result = new Complex();
        System.out.println("So phuc 1:");
        complex1.input(sc);
        System.out.println("So phuc 2:");
        complex2.input(sc);
        sc.nextLine();
        while (true) {
            System.out.println("Tinh toan");
            System.out.println("1: Cong so phuc");
            System.out.println("2: Tru so phuc");
            System.out.println("3: Nhan so phuc");
            System.out.println("4: Chia so phuc");
            System.out.println("5: Thoat");
            System.out.print("Nhap lua chon 1->5 :");
            String line = sc.nextLine();
            switch (line) {
                case "1" -> {
                    result = complex1.addition(complex2);
                    System.out.println("Ket qua :");
                    result.display();
                }
                case "2" -> {
                    result = complex1.subtraction(complex2);
                    System.out.println("Ket qua :");
                    result.display();
                }
                case "3" -> {
                    result = complex1.multiplication(complex2);
                    System.out.println("Ket qua :");
                    result.display();
                }
                case "4" -> {
                    result = complex1.division(complex2);
                    System.out.println("Ket qua :");
                    result.display();
                }
                default -> {
                    System.out.println("Loi");
                }
            }
        }
    }
}
