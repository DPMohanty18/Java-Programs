class Cons{
    int l;
    int b;
    Cons()
    {
    }
    Cons(int x){
        l=x;
        b=x;
    }
    Cons(int c,int d){
        l=c;
        b=d;
    }
    void display(){
        System.out.println("Area= "+(l*b));
        System.out.println("Perimeter= "+(2*(l+b)));
    }
}
class Sqrect{
    public static void main(String[] args) {
        System.out.println("Area & Perimeter of Square:");
        Cons c1 = new Cons(10);
        c1.display();
        System.out.println("Area & Perimeter of Rectangle:");
        Cons c2 = new Cons(10,15);
        c2.display();
    }
}