class Cpyconst
{
    int rollno;
    String name;
    Cpyconst()
    {
        rollno=20;
        name="Rahul";
    }
    Cpyconst(Cpyconst s)
    {
        rollno=s.rollno;
        name=s.name;

    }
    void display()
    {

        System.out.println("Roll No:"+rollno);

        System.out.println("Name:"+name);
    }

    public static void main(String args[])
    {
        Cpyconst s1=new Cpyconst();
        Cpyconst s2=new Cpyconst(s1);
        s1.display();
        s2.display();
    }
}