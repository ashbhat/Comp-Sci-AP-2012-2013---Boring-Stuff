import java.util.Random;
import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LotteryPrinter

{
    public static void main(String [] args)
    
    {
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);    
    Rectangle abc = new Rectangle(10,10,10,10);
    frame.setBounds(abc);
    JOptionPane.showMessageDialog(frame, "Click below! It may be your lucky day! If your number match you may redeem it for a memory value less than or equal to 1 bit.");
    Random ash = new Random();
    int x = ash.nextInt(46);
    x += 1;
    System.out.println("Your lucky numbers are the following!");
    System.out.println(x);
    x = ash.nextInt(46);
    System.out.println(x);
    x = ash.nextInt(46);
    System.out.println(x);
    x = ash.nextInt(46);
    System.out.println(x);
    x = ash.nextInt(46);
    System.out.println(x);
    x = ash.nextInt(46);
    System.out.println(x);
    }    


}