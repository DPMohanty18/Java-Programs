class Construct{
    int a;
    int b;
    Construct()
    {
        a=10;
        b=15;
    }
    Construct(int x){
        a=x;
        b=x;
    }
    Construct(int c,int d){
        a=c;
        b=d;
    }
    void display(){
        System.out.println("Sum= "+(a+b));
    }
}
class Coverload{
    public static void main(String[] args) {
        Construct c = new Construct();
        c.display();
        Construct c1 = new Construct(10);
        c1.display();
        Construct c2 = new Construct(20,30);
        c2.display();
    }
}