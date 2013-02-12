import java.lang.Math;

/**
 * Write a description of class Pair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pair
{
    // instance variables - replace the example below with your own
    private double x;
    private double y;

    /**
     * Constructor for objects of class Pair
     */
    public Pair(double a, double b)
    {
        x = a;
        y = b;
    }
    
    public double getSum()
    {
        double sum = x+y;
        return sum;
    }    
    
    public double getDifference()
    {
        double Difference = x-y;
        return Difference;
    }  
    
    public double getProduct()
    {
        double Product = x*y;
        return Product;
    }
    
    public double getAverage()
    {
        double amount = (x+y)/2;
        return amount;
    }
    
    public double getDistance()
    {
        double amount = Math.abs(x) + Math.abs(y);
        return amount;
    }

    public double getMaximum()
    {
        double amount = Math.max(x,y);
        return amount;
    }
    
    public double getMinimum()
    {
        double amount = Math.min(x,y);
        return amount;
    }
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
}
