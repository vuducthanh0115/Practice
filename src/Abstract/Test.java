package Abstract;

abstract class Test {
    public Test(){
        System.out.println("Hello Test");
    }
    private String name = "T";
    abstract void print1();
    void display(){
        System.out.println("Test");
    }
    String getName(){
        return name;
    }
}
