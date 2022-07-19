package Java8;

public interface DefaultMethod2 {
    default void test2(String s) {
        System.out.println("Hello, Interface" + s);
    }
}
