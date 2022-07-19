package Java8;

public class Static1 implements InterfaceStatic {

    void prints() {
        System.out.println("Class Static1");
    }

    public static void main(String[] args) {
        Static1 s = new Static1();
        s.prints();
        InterfaceStatic.prints();
    }
}
