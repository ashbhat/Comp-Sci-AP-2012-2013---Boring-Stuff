
/**
 * Write a description of class Moth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Moth
{
    // instance variables - replace the example below with your own
    private int x;
    private double position;
    /**
     * Constructor for objects of class Moth
     */
    public Moth(double initialposition)
    {
       position = initialposition;
    }
    
    public void moveToLight(double lightPosition)
    {
        position = (lightPosition - position)/2 + position;   
    }
    
    public double getPosition()
    {
        double theposition = position;
        return theposition;
    }    
}
