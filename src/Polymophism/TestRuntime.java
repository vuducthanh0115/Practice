package Polymophism;

public class TestRuntime extends TestRuntime2 {
    int i = 100;

    public static void main(String[] args) {
        TestRuntime2 t = new TestRuntime();
        System.out.println(t.i);
    }
}
