class Student{
    String name;
    int roll;
    void studentdata(String n,int r){
        name = n;
        roll = r;
    }
    void studisplay(){
        System.out.println("Name: "+name+" Roll: "+roll);
    }
}
class Exam extends Student{
    int mark1,mark2;
    void exmark(int m1,int m2){
        mark1 = m1;
        mark2 = m2;
    }
    void mdisplay(){
        System.out.println("Math: "+mark1+" Science: "+mark2);
    }
}
class Total extends Exam{
    int total,smark;
    void insports(int a){
        smark = a;
    }
    void showresult(){
        total = smark+mark1+mark2;
        studisplay();
        mdisplay();
        System.out.println("Sportsmark: "+smark);
        System.out.println("Total mark: "+total);
    }
}
class Minheritance{
    public static void main(String[] args) {
        Total t = new Total();
        t.studentdata("Rahul",20);
        t.exmark(90,89);
        t.insports(100);
        t.showresult();
    }
}