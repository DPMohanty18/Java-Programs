import java.awt.*;
import java.awt.event.*;
class CheckboxDemo extends Frame implements ItemListener
{
    Checkbox c1,c2,c3,c4;
    TextField t;
    CheckboxDemo()
    {
        c1=new Checkbox("c++");
        add(c1);
        c1.setBounds(100,100,50,50);
        c1.addItemListener(this);

        c2=new Checkbox("java");
        add(c2);
        c2.setBounds(100,150,50,50);
        c2.addItemListener(this);

        c3=new Checkbox("python");
        add(c3);
        c3.setBounds(100,200,50,50);
        c3.addItemListener(this);

        c4=new Checkbox("c");
        add(c4);
        c4.setBounds(100,250,50,50);
        c4.addItemListener(this);


        t=new TextField(20);
        add(t);
        setSize(300,300);
        //setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    public void itemStateChanged(ItemEvent e)
    {
        if(e.getItemSelectable()==c1)
        {
            t.setText("you have opted c++");
        }
        if(e.getItemSelectable()==c2)
        {
            t.setText("you have opted java");
        }
        if(e.getItemSelectable()==c3)
        {
            t.setText("you have opted python");
        }
        if(e.getItemSelectable()==c4)
        {
            t.setText("you have opted c");
        }
    }
    public static void main(String args[])
    {
        new CheckboxDemo();
    }
}