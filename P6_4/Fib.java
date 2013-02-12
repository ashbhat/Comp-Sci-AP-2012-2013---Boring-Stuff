import java.util.Scanner;
/**
 * Write a description of class Fib here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fib
{
    // instance variables - replace the example below with your own
    private int fold1 = 1;
    private int fold2 = 1;
    private int q;
    /**
     * Constructor for objects of class Fib
     */
    public Fib()
    {
        // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void nextNumber(int n)
    {
        if(n==1)
        System.out.println("1");
        else{
        System.out.println("1");
        for (int i = 1; i<=n; i++){
        q=fold1;
        fold1=fold2;
        fold2=fold2+q;
        System.out.println("\n" + fold2);
        }
    }
    }
     
    /*public void nextNumber(int n)
    {
        
        for (int i = 1; i<=n; i++){
        fold1=q;
        fold1=fold2;
        fold2=fold2+q;
        System.out.println("\n" + fold2);
        }
    }*/
}
