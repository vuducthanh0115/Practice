package Keys;

public class Thanh2 extends Thanh{
    String s;

    Thanh2(){
        super("Thanh");
        System.out.println("Hi");
    }
    Thanh2(String s){
        this();
        this.s = s;
        System.out.println(s);
    }
    public static void main(String[] args) {
        Thanh2 a = new Thanh2();
        Thanh2 b = new Thanh2("Hai");
    }
}
