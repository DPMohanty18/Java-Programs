abstract class DemoA{
    abstract void display1();
    void display(){
        System.out.println("hello");
    }
}
class DemoB extends Demo1{
    void display() {
        super.display();
        System.out.println("World");
    }
    void display1() {
        System.out.println("good morning");
    }
}
class Abstractdemo{
    public static void main(String[] args) {
        DemoB d = new DemoB();
        d.display();
        d.display1();
    }
}