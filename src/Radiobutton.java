import java.awt.*;
import java.awt.event.*;

class Radiobutton {
    Radiobutton() {
        Frame f = new Frame("Checkbox Group");
        CheckboxGroup cbg = new CheckboxGroup();
        Checkbox cb1 = new Checkbox("C++", cbg, false);
        cb1.setBounds(100, 100, 50, 50); // Adjusted position for cb1
        Checkbox cb2 = new Checkbox("Java", cbg, true);
        cb2.setBounds(100, 150, 50, 50); // Adjusted position for cb2
        f.add(cb1);
        f.add(cb2);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
    }

    public static void main(String[] args) {
        Radiobutton r = new Radiobutton();
    }
}
