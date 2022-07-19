package bai11;

import java.util.Scanner;

public class Complex {
    private double real;
    private double img;

    public Complex() {
    }

    public Complex(double real, double img) {
        this.real = real;
        this.img = img;
    }

    public void input(Scanner sc) {
        System.out.print("Nhap vao phan thuc: ");
        real = sc.nextDouble();
        System.out.print("Nhap vao phan ao: ");
        img = sc.nextDouble();
    }

    public void display() {
        if (img < 0) {
            System.out.println(real + " - " + Math.abs(img) + "*i");
        } else {
            System.out.println(real + " + " + img + "*i");
        }
    }

    public Complex addition(Complex complex2) {
        double aReal = real + complex2.real;
        double aImg = img + complex2.img;
        return new Complex(aReal, aImg);
    }

    public Complex subtraction(Complex complex2) {
        double sReal = real - complex2.real;
        double sImg = img - complex2.img;
        return new Complex(sReal, sImg);
    }

    public Complex multiplication(Complex complex2) {
        double mReal = real * complex2.real - img * complex2.img;
        double mImg = real * complex2.img + complex2.real * img;
        return new Complex(mReal, mImg);
    }

    public Complex division(Complex complex2) {
        double dReal = (real * complex2.real + img * complex2.img) / (complex2.real * complex2.real + complex2.img * complex2.img);
        double dImg = (complex2.real * img - real * complex2.img) / (complex2.real * complex2.real + complex2.img * complex2.img);
        return new Complex(dReal, dImg);
    }
}
