package basic;

import java.lang.Integer;
import java.lang.String;
class Test implements Test2{
}

interface Test2{

}

public class InstanceOf extends Test implements Test2 {
    public static void main(String[] args) {
        Integer a = 5;
        Boolean check = a instanceof Integer;
        System.out.println(check);

        Test t = new Test();
        System.out.println(t instanceof Test2);

        Test2 t1 = new InstanceOf();
        System.out.println(t1 instanceof Test2);

        InstanceOf t2 = null;
        System.out.println(t2 instanceof InstanceOf);
    }
}
