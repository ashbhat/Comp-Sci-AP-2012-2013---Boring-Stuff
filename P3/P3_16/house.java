import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;

public class house extends JComponent
{
public void paintComponent(Graphics g)
{
    Graphics2D g2 = (Graphics2D) g;
    Ellipse2D.Double circle2 = new Ellipse2D.Double(getWidth()/4, 9, getWidth()/2,getHeight()/2 + 20);
    g2.draw(circle2);
    g2.setColor(Color.WHITE);
    g2.fill(circle2);
    g2.setColor(Color.WHITE);
    g2.setColor(Color.BLACK);
    Rectangle house = new Rectangle(getWidth()/4,getHeight()/2,getWidth()/2,getHeight());
    g2.draw(house);
    g2.setColor(Color.BLACK);
    g2.fill(house);
    Rectangle door = new Rectangle(getWidth()/3,getHeight()-getHeight()/8,getWidth()/10,getHeight());
    g2.setColor(Color.WHITE);
    g2.fill(door);
    
    /*
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
    g2.fill(circle5);*/
} }