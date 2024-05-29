abstract class Demo{
    void display(){
        System.out.println("Hello");
    }
    abstract void display1();
}
class Demo1 extends Demo{
    @Override
    void display() {
        super.display();
        System.out.println("World");
    }
    void display1(){
        System.out.println("Good Morning");
    }
}
class Abstract{
    public static void main(String[] args) {
        Demo d = new Demo1();
        d.display();
        d.display1();
    }
}