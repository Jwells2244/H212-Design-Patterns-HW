import java.awt.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class Sequence extends JComponent {
    private ArrayList<Integer> values;
    ArrayList<Circle> circles = new ArrayList<Circle>();
    public Sequence() {
        this.values = new ArrayList<Integer>();
    }
    public Sequence(int[] values){
        this(); // ha, ha!
        for (int v : values) {
            this.values.add( v);
            this.circles.add(new Circle(v, (int)(Math.random() * 400 + 50),
                    (int)(Math.random() * 400 + 50)));

        }
    }
    public void add(int n) {
        this.values.add(n);
    }
    public Integer get(int n) {
        return this.values.get(n);
    }
    public int length() {
        return this.values.size(); }

    public String toString() {
        return this.values.toString();
    }

    public void paintComponent(Graphics g){
        //g.drawString(this + " ", 80, 120);
        for (int i = 0; i < this.values.size()-1; i ++){
            Circle a = this.circles.get(i), b = this.circles.get(i+1);
            a.draw(g);
            g.drawLine(a.x+a.radius, a.y+a.radius, b.x+b.radius, b.y+b.radius);
        }
        this.circles.get(this.values.size()-1).draw(g);
    }

    public static void main(String[] args) {
        Sequence m = new Sequence( new int[] { 2, 7, 8, 9, 1, 4, 5 } );
        System.out.println(m);
        JFrame a = new JFrame("Homework 3");
        a.setVisible(true);
        a.setSize(500, 500);
        a.add(m);
    }
}