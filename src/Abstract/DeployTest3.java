package Abstract;

public class DeployTest3 extends DeployTest {
    void print1() {
        System.out.println(super.getName() + " " + "DeployTest");
        super.print2();
    }
}
