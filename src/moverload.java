class Method{
    int a=5,b=10,c=0;
    void sum(){
        c=a+b;
        System.out.println(c);
    }
    void sum(int x,int y){
        a=x;
        b=y;
        c=a+b;
        System.out.println(c);
    }
    void sum(int n){
        a=n;
        b=n;
        c=a+b;
        System.out.println(c);
    }
}
class moverload{
    public static void main(String[] args) {
        Method m = new Method();
        m.sum();
        m.sum(10,20);
        m.sum(10);
    }
}