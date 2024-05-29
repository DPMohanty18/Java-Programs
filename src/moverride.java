class A{
    void display(){
        System.out.println("Hello");
    }
}
class B extends A{
    void display() {
        super.display();
        System.out.println("world");
    }
}
class C extends B{
    void display(){
        super.display();
        System.out.println("Good Morning");
    }
}
class Moverride{
    public static void main(String[] args) {
        C r = new C();
        r.display();
    }
}