import java.lang.Math;

/**
 * Write a description of class Quadratic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Quadratic
{
    // instance variables - replace the example below with your own
    private double a;
    private double b;
    private double c;
    private double x;
    private double d;
    private double e;
    private double f;
    

    /**
     * Constructor for objects of class Quadratic
     */
    public Quadratic(double w, double y, double z)
    {
        a = w;
        b = y;
        c = z;
    }
       
    // quadratic formula is axsqrd + bx + c = 0
    public double getSolution1()
    {
       d = ((-b) + Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
       return d;
    }
    
    public double getSolution2()
    {
       
       x = ((-b) - Math.sqrt(Math.pow(b,2) - 4*a*c))/(2*a);
       return x;
    }
}
