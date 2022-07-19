package accessmodifier;

public class Constructor {
    int a;
    int b;
    int c;
    public Constructor(){
    }
    public Constructor(int a, int b){
        this.a = a;
        this.b = b;
    }
    public Constructor(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(1,2);
        Constructor c3 = new Constructor(3,4,5);
        System.out.println(c1.a + " " + c1.b + " " + c1.c);
        System.out.println(c2.a + " " + c2.b + " " + c2.c);
        System.out.println(c3.a + " " + c3.b + " " + c3.c);
    }
}
