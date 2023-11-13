import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.Graphics;


public class Shapes extends JComponent {
    public static void main(String[] args){
        JFrame a = new JFrame();
        a.setVisible(true);
        a.setSize(500, 500);
        a.add(new Shapes());
    }
    Point a, b, c;
    Line l1, l2, l3, l4, l5, l6;
    Triangle t, t2;
    public Shapes(){
        this.a = new Point(90, 75);
        this.b = new Point(410, 75);
        this.c = new Point(225, 245);
        Point a = new Point(89, 234), b = new Point(65, 460);
        this.l1 = new Line(a, b);
        Point c = new Point(400, 20), d = new Point(315, 67);
        this.l2 = new Line(c,d);
        this.l3 = new Line(new Point(150, 90), new Point(300, 90));
        this.l4 = new Line(new Point(150, 400), new Point(300, 400));
        this.l5 = new Line(new Point(150, 90), new Point(300, 400));
        this.l6 = new Line(new Point(300, 90), new Point(150, 400));
        Point f = new Point(150, 90), g = new Point(15, 90);
        this.t = new Triangle(f, g, new Point(150, 400));
        this.t2 = new Triangle(new Point(300, 90), new Point(435, 90), new Point(300, 400));
    }
    public void paintComponent(Graphics g){
        this.a.draw(g);
        this.b.draw(g);
        this.c.draw(g);
        this.l1.draw(g);
        this.l2.draw(g);
        this.l3.draw(g);
        this.l4.draw(g);
        this.l5.draw(g);
        this.l6.draw(g);
        this.t.draw(g);
        this.t2.draw(g);
    }
}
