package Polymophism;

public class Runtime extends Runtime2 {
    public void print(){
        System.out.println("Runtime");
    }
    public static void main(String[] args) {
        Runtime2 r = new Runtime();
        r.print();
    }
}
