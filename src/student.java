class Parent
{
    int roll;
    String name;

    void getStudent(int a,String b)
    {
        roll=a;
        name=b;
    }
    void displaystudent()
    {

        System.out.println("Roll:="+roll+"Name:="+name);
    }
}
class Examm extends Parent
{
    int mark1,mark2;
    void getExam(int a,int b)
    {
        mark1=a;
        mark2=b;
    }
    void displayExam()
    {
        System.out.println("Mark1:="+mark1+"Mark2:="+mark2);
    }

}

class Studen
{
    public static void main(String args[])
    {
        Examm e = new Examm();
        e.getStudent(12,"Alok");
        e.getExam(52,78);
        e.displaystudent();
        e.displayExam();
    }


}