import java.awt.*;
import java.awt.event.*;
class TextEvent extends Frame implements ActionListener{
    TextField t1;
    TextEvent(){
        t1= new TextField();
        t1.setBounds(30,100,80,30);
        Button b = new Button("Click me");
        b.setBounds(60,50,170,20);
        b.addActionListener(this);
        add(b);
        add(t1);
        setSize(900,900);
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent f){
             dispose();
            }
        });
    }
    public void actionPerformed(ActionEvent e){
        t1.setText("welcome");
    }

    public static void main(String[] args) {
        TextEvent t = new TextEvent();
    }
}