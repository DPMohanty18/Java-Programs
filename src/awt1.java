import java.awt.*;

public class awt1 extends Frame {
    awt1() {
        Button b = new Button("Register");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,300);
        setTitle("This is our basic AWT example");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        awt1 d = new awt1();
    }
}
