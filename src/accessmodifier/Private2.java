package accessmodifier;

public class Private2 {
    public static void main(String[] args) {
        Private p = new Private();
        //System.out.println(p.a); //Error
        System.out.println(p.getA());
        p.setA(100);
        System.out.println(p.getA());

    }
}
