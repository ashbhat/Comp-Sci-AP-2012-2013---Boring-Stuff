import java.util.Scanner;
/**
 * Write a description of class ordertester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ordertester
{
    public static void main(String [] args)
    {
    Scanner test = new Scanner(System.in);
    System.out.println("What are your three numbers. Following each number, click enter.");
    double a = test.nextDouble();
    double b = test.nextDouble();
    double c = test.nextDouble();
    order test1 = new order(a,b,c);
    System.out.println(test1.getOrder());
        
        
    }    
}
