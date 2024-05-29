import Mypkg.Studentb;
class Examb extends Studentb{
    int mark1,mark2;
    void setexam(int a,int b){
        mark1=a;
        mark2=b;
    }
    void displaymark(){
        System.out.println("Mark1="+mark1+"Mark2="+mark2);
    }
}
class Packagedemo{
    public static void main(String[] args) {
        Examb s = new Examb();
        s.setstudent(20,"Rahul");
        s.setexam(90,95);
        s.display();
        s.displaymark();
    }
}