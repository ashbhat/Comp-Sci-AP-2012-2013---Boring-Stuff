import java.awt.Color;
import javax.swing.JFrame;

public class BrighterDemo

{
public static void main(String [] args)
{
JFrame frame = new JFrame();
frame.setSize(200, 200);
Color red = new Color(255, 0, 0);
Color darkerred = red.darker();
Color darkestred = darkerred.darker();
frame.getContentPane().setBackground(darkestred);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
System.out.print(darkestred);
}
}