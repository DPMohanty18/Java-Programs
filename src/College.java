
class College
{
    int rollno;
    String name;
    static String college ="TACT";

    static void change()
    {
        college = "Trident";
    }

    College(int r,String n)
    {
        rollno=r;
        name=n;
    }

    void display( ){System.out.println(rollno+" "+name+" "+college);}

    public static void main(String args[ ])
    {
        College c1=new College(11,"Ramesh");
        College c2=new College(22,"Umesh");
        c1.display();
        c2.display();

        change();
        College c3=new College(33,"Rajesh");
        c3.display();
    }
}
