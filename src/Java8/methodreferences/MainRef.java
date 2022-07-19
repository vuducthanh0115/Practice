package Java8.methodreferences;

public class MainRef {
    static String action(String a, String b, InterfaceRef interfaceRef) {

        return interfaceRef.process(a, b);
    }

    public static void main(String[] args) {
        String s = action("Thanh", "Vu", ClassRef::concat);
        String s2 = ClassRef.concat("Thanh", "Vu");
        System.out.println(s);
        System.out.println(s2);
    }
}
