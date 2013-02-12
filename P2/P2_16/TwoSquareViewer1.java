import java.awt.Color;
import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.Graphics2D;
import javax.swing.JComponent;

public class TwoSquareViewer1 extends JComponent
{
public void paintComponent(Graphics g)
{
    Graphics2D g2 = (Graphics2D) g;
    g2.setColor(Color.PINK);
    Rectangle pink = new Rectangle(5, 5, 100, 100);
    g2.draw(pink);
    g2.fill(pink);
    g2.setColor(Color.MAGENTA);
    Rectangle purple = new Rectangle(5, 105, 100, 100);
    g2.draw(purple);
    g2.fill(purple);
}
}