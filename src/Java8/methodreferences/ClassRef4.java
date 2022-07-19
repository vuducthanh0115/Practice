package Java8.methodreferences;

public class ClassRef4 implements InterfaceRef4 {

    public ClassRef4(String s) {
        System.out.println("Hello" + " " + s);
    }

    public void print(String s) {
        System.out.println(s);
    }
}
