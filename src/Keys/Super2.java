package Keys;

public class Super2 extends Super{
    void print(String s) {
        System.out.println("Hi " + s);
    }
    void display(){
        super.print("A");
    }
    public static void main(String[] args) {
        Super2 a = new Super2();
        a.display();
    }
}
