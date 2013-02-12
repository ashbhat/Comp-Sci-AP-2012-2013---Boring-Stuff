import java.awt.Rectangle;
public class P2_2


{
public static void main(String [] args)
    {
        Rectangle abc = new Rectangle(10,10,10,10);
        double w = abc.getWidth();
        double h= abc.getHeight();
        System.out.println(w+w+h+h);
        System.out.println("Expected=40");
    }    
}