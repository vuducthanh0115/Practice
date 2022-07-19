package accessmodifier;

public class Test2 {
    int i;
    private Test2(int i){
        this.i = i;
    };
    public static void main(String[] args) {
        Test t = new Test();
        System.out.println(t.t);
        Test2 t2 = new Test2(10);
        System.out.println(t2.i);
    }
}
