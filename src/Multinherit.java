interface sport{
    int sportm = 6;
    public void sprint();
}
class Stu{
    int roll=10;
    void displayroll(){
        System.out.println("Roll no="+roll);
    }
}
class Examstu extends Stu{
    int mark1,mark2;
    void getmark(int m1,int m2){
        mark1 = m1;
        mark2 = m2;
    }
    void displaymark(){
        System.out.println("Mark1="+mark1);
        System.out.println("Mark2-"+mark2);
    }
}
class Totals extends Examstu implements sport{
    int total;

    @Override
    public void sprint() {
        System.out.println("sports mark="+sportm);
    }
    void displayy(){
        total=mark1+mark2+sportm;
        displayroll();
        displaymark();
        sprint();
        System.out.println("Total mark="+total);
    }
}
class Multinherit{
    public static void main(String[] args) {
        Totals t = new Totals();
        t.getmark(10,20);
        t.displayy();
    }
}