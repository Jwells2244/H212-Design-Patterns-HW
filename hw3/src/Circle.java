import java.awt.Graphics;
import java.awt.Color;

public class Circle {
    int value;
    int x, y;
    int radius = 10;
    Color randomColor;
    public Circle(int v, int x, int y){
        this.x = x;
        this.y = y;
        this.value = v;
    }
    public void draw(Graphics g){
        int xc = this.x + this.radius, yc = this.y + this.radius;
        g.setColor(Color.WHITE);
        g.fillOval(this.x, this.y, 2 * this.radius, 2 *this.radius);
        randomColor = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        g.setColor(randomColor);
        g.drawString(this.value + " ", xc-3, yc+3);
        randomColor = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
        g.setColor(randomColor);
        g.drawOval(this.x, this.y, 2 * this.radius, 2 *this.radius);
    }
}
