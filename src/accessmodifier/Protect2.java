package accessmodifier;

public class Protect2 extends Protected{
    public static void main(String[] args) {
        Protect2 p = new Protect2();
        System.out.println(p.a);
        p.display();
    }
}
