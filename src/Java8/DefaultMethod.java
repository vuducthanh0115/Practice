package Java8;

public interface DefaultMethod {

    default void test2(String s) {
        System.out.println("Hi, " + s);
    }
}
