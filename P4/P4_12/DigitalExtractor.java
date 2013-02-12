import java.lang.Math;

/**
 * Write a description of class Reverse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DigitalExtractor
{
    // instance variables - replace the example below with your own
    private int x;
    private int n;
    private int d;
    /**
     * Constructor for objects of class Reverse
     */
    public DigitalExtractor(int anInteger)
    {
       x = anInteger;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int nextDigit()
    {
        double a = Math.pow(10,n);
        double e = x/Math.pow(a/10,d);
        double b = x/Math.pow(a,d);
        double f = Math.pow(a,d);
        int c = (int)b*(int)a/(int)f;
        int j = c/10*10;
        int digit = (int)b - j;// - b*c*a;
        n = n+1;
        d = 1;
        return digit;
        
        /*double a = Math.pow(10,n);
        double e = x/Math.pow(a/10,d);
        double b = x/Math.pow(a,d);
        int c = (int)b*(int)a;
        int digit = (int)e - c;// - b*c*a;
        n = n+1;
        d = 1;
        return (int)b;*/
    }
    /*
     * double a = Math.pow(10,n);
        double e = x/Math.pow(a/10,d);
        double b = x/Math.pow(a,d);
        double f = Math.pow(a,d);
        int c = (int)b*(int)a/(int)f;
        int j = c/10*10;
        int digit = (int)b - j;// - b*c*a;
        n = n+1;
        d = 1;
        return digit;
     */
}
