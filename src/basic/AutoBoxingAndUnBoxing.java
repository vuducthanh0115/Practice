package basic;

import static java.lang.Integer.valueOf;

public class AutoBoxingAndUnBoxing {
    public static void main(String[] args) {
        int a = 1;
        Integer b = new Integer(a);
        Integer c = 2;
        Integer d = valueOf(9);
        int e = valueOf(c);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
    }
}
