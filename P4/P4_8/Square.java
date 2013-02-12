import java.lang.Math;

/**
 * Write a description of class Square here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Square
{
    // instance variables - replace the example below with your own
    private double s;
    private double perimeter;
    private double diagonal;
    private double area;
    /**
     * Constructor for objects of class Square
     */
    public Square(int sides)
    {
        s = sides;
        perimeter = 4*sides;
        diagonal = Math.sqrt(2*sides*sides);
        area = sides*sides;
    }

    public double getPerimeter()
    {
        return perimeter;
    }
    
    public double area()
    {
        return area;
    }
    
    public double getDiagonal()
    {
        return diagonal;
    }
}
