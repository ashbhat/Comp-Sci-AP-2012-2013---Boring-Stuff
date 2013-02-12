import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class P2_6

{
public static void main(String [] args)
{
    //construct a feame and show it
    
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
    
    //Your work goes here:
    Rectangle abc = new Rectangle(10,10,10,10);
    frame.setBounds(abc);
    //Construct a rectangle and set the frame bounds
    
    JOptionPane.showMessageDialog(frame, "Click OK to continue");
    
    //Your work goes here:
   abc.translate(100,100);
    frame.setBounds(abc);
    JOptionPane.showMessageDialog(frame, "Click OK to continue");
    //Construct a rectangle and set the frame bounds again
}


}