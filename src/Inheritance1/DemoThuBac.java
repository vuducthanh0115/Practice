package Inheritance1;

public class DemoThuBac {
    public static void main(String[] args) {
        ThuBac1 tb1 = new ThuBac1();
        tb1.print1();
        // tb1.print2(); Error
        ThuBac tb = new ThuBac();
        tb.print();
        ThuBac2 tb2 = new ThuBac2();
        //tb.print1(); Error
        tb2.print2();
    }
}
