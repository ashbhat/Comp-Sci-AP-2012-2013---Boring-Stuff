import java.awt.Rectangle;
public class P2_1
{

public static void main(String[] args)
    {
        Rectangle abc = new Rectangle(10, 10, 10, 10);
        double width =  abc.getWidth();
        double height = abc.getHeight();
        System.out.println(height*width);
        System.out.println("Expected=100");
    }
}