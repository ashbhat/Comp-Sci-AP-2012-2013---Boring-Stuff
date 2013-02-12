
/**
 * Write a description of class Pile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pile
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Pile
     */
    public Pile(int size)
    {
        // initialise instance variables
        x = size;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void take(int taker)
    {
       x = x - taker;
    }
    public int left()
    {
       return x;
    }
}
