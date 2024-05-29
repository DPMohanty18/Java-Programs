import java.awt.*;
import java.awt.event.*;
class TextEventDemo extends Frame implements ActionListener
{
    TextField t1;
    TextEventDemo()
    {
        t1=new TextField();
        t1.setBounds(60,50,170,20);
        Button b=new Button("click me");
        b.setBounds(100,120,50,30);
        b.addActionListener(this);
        add(b);
        add(t1);
        setSize(300,300);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        t1.setText("welcome to trident");
    }
    public static void main(String args[])
    {
        new TextEventDemo();
    }
}