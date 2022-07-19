package Polymophism;

public class Compiler2 {
    int a,b,c;
    public Compiler2(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Compiler2(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }


    public static void main(String[] args) {
        Compiler2 t1 = new Compiler2(1,2);
        Compiler2 t2 = new Compiler2(1,2, 3);
        System.out.println(t1.a + " " + t1.b);
        System.out.println(t2.a + " " + t2.b + " " + t2.c);
    }
}
