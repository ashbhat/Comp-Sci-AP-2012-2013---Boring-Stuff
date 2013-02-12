import java.awt.Rectangle;

public class P2_5

{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle(20,20,20,10);
        Rectangle r2 = new Rectangle(10,10,10,20);
        System.out.println(r1);
        System.out.println(r2);
        Rectangle r3 = r1.intersection(r2);
        System.out.println(r3);
        //the resulting rectangle is empty as it exists within the 2
    }
    

    
}    