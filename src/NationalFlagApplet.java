import java.applet.Applet;
import java.awt.*;

public class NationalFlagApplet extends Applet {
    public void paint(Graphics g) {
        // Set background color to white
        setBackground(Color.WHITE);

        // Draw the green rectangle (bottom stripe)
        g.setColor(Color.GREEN);
        g.fillRect(0, 200, 600, 100);

        // Draw the saffron rectangle (middle stripe)
        g.setColor(new Color(255, 153, 51)); // RGB value for saffron
        g.fillRect(0, 100, 600, 100);

        // Draw the white rectangle (top stripe)
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, 600, 100);
    }
}
