package Java8.methodreferences;

public class Main4 {
    public static void main(String[] args) {
        InterfaceRef4 ref = ClassRef4::new;
        //InterfaceRef4 ref2 = new ClassRef4("Thanh");
        ref.print("Thanh");
    }
}
