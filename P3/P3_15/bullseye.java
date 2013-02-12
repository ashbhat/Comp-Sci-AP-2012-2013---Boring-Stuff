import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;

public class bullseye extends JComponent
{
public void paintComponent(Graphics g)
{
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.BLACK);
    Ellipse2D.Double circle1 = new Ellipse2D.Double(0, 0, 150, 150);
    g2.draw(circle1);
    g2.fill(circle1);
    g2.setColor(Color.WHITE);
    Ellipse2D.Double circle2 = new Ellipse2D.Double(13, 13, 125, 125);
    g2.draw(circle2);
    g2.fill(circle2);
    g2.setColor(Color.BLACK);
    Ellipse2D.Double circle3 = new Ellipse2D.Double(25, 25, 100, 100);
    g2.draw(circle3);
    g2.fill(circle3);
    g2.setColor(Color.WHITE);
    Ellipse2D.Double circle4 = new Ellipse2D.Double(37, 37, 75, 75);
    g2.draw(circle4);
    g2.fill(circle4);
    g2.setColor(Color.BLACK);
    Ellipse2D.Double circle5 = new Ellipse2D.Double(50, 50, 50, 50);
    g2.draw(circle5);
    g2.fill(circle5);
    /*g2.setColor(Color.PINK);
    Rectangle pink = new Rectangle(5, 5, 100, 100);
    g2.draw(pink);
    g2.fill(pink);
    g2.setColor(Color.MAGENTA);
    Rectangle purple = new Rectangle(5, 105, 100, 100);
    g2.draw(purple);
    g2.fill(purple);*/
} }