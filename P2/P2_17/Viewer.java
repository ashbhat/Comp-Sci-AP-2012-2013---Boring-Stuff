import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Viewer extends JComponent
{
public void paintComponent(Graphics g)
{
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.BLACK);
    Ellipse2D.Double ellipse = new Ellipse2D.Double(0, 0, getWidth(), getHeight());
    g2.draw(ellipse);
    g2.setColor(Color.BLUE);
    g2.fill(ellipse);
    
    /*Ellipse2D.Double eye = new Ellipse2D.Double(20, 20, 50, 50);
    g2.draw(eye);
    
    eye = new Ellipse2D.Double(90, 20, 50, 50);
    g2.draw(eye);
    
    Line2D.Double mouth = new Line2D.Double(30, 110, 110, 110);
    g2.draw(mouth);*/
    /*g2.setColor(Color.PINK);
    Rectangle pink = new Rectangle(5, 5, 100, 100);
    g2.draw(pink);
    g2.fill(pink);
    g2.setColor(Color.MAGENTA);
    Rectangle purple = new Rectangle(5, 105, 100, 100);
    g2.draw(purple);
    g2.fill(purple);*/
}
}