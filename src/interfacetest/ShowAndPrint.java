package interfacetest;

public class ShowAndPrint implements Print, Show{
    public void print(){
        System.out.println("Here");
    }

    public static void main(String[] args) {
        ShowAndPrint s = new ShowAndPrint();
        s.print();
    }
}
