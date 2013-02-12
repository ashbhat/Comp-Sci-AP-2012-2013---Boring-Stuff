import java.lang.Math;

/**
 * Write a description of class IceCreamCone here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class IceCreamCone
{
    // instance variables - replace the example below with your own
    private int x;
    private double h;
    private double r;
    private double l;
    public static final double PI = 3.141592653589793;
    /**
     * Constructor for objects of class IceCreamCone
     */
    public IceCreamCone(double height, double radius)
    {
        h = height;
        r = radius;
        l = Math.sqrt(radius*radius + height*height); 
    }
    
    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public double getSurfaceArea()
    {
        double area = PI*r*l /*- PI*r*r*/;
        return area;
    }
    public double getVolume()
    {
        double volume = PI*r*r*h;
        return volume;
    }    
}
