package Abstract;

public class All {
    public static void main(String[] args) {
        Test t = new DeployTest2();
        Test t2 = new DeployTest3();
        t.print1();
        t.display();
        t2.print1();
        t2.display();
    }
}
