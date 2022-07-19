package Keys;

public class StaticTest {
    static int i = 1;
    int j = 5;

    static void change() {
        i = 10;
        System.out.println(i);
    }

    static void change2() {
        System.out.println(i);
        change();

    }
}
