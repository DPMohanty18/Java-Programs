class Studenta{
    int roll;
    String name;
    void setstudent(int a, String b){
        this.roll=a;
        this.name=b;
    }
    void display(){
        System.out.println("Roll="+roll+"Name="+name);
    }
}
interface sports{
    int spmark=10;
    void displayresult();
}
class Exama extends Studenta implements sports{
    int mark1,mark2;
    void setexam(int a,int b){
        mark1=a;
        mark2=b;
    }
    void displaymark(){
        System.out.println("Mark1="+mark1+"Mark2="+mark2);
    }
    public void displayresult() {
        int total=mark1+mark2+spmark;
        System.out.println("Total="+total);
    }
}
class Interfacedemo{
    public static void main(String[] args) {
        Exama s = new Exama();
        s.setstudent(20,"Rahul");
        s.setexam(90,95);
        s.display();
        s.displaymark();
        s.displayresult();
    }
}