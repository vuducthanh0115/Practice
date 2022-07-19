package Java8.methodreferences;

public class MainRef2 {
    static String action(String a, String b, InterfaceRef interfaceRef) {

        return interfaceRef.process(a, b);
    }

    public static void main(String[] args) {
        ClassRef2 c = new ClassRef2();
        String s = action("Duc", "Thanh", c::concat);
        System.out.println(s);
    }
}
