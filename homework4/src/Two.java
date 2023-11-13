import javax.swing.*;
import java.awt.*;

public class Two extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;

        float thickness = 6;
        Stroke oldStroke = g2.getStroke();
        g2.setStroke(new BasicStroke(thickness));

        Rectangle a = new Rectangle(100,100,200, 50);
        g2.setColor(Color.BLUE);
        g2.draw(a);
        Rectangle b = new Rectangle(150, 120, 100, 250);
        g2.setColor(Color.RED);
        g2.draw(b);
        Rectangle ab = a.intersection(b);
        g2.setColor(Color.GREEN);
        g2.fill(ab);
        Rectangle c = new Rectangle(400, 400, 50, 80);
        Rectangle ac = a.intersection(c);
        g2.setColor(Color.ORANGE);
        g2.fill(ac);
        g2.setStroke(oldStroke);
    }
}
