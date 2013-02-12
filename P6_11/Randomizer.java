import java.util.Random;
/**
 * Write a description of class Randomizer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Randomizer
{
    // instance variables - replace the example below with your own
    private Random generator;
    private int times;
    private double sum;
    private double count;
    private double maximum;
    public Randomizer()
    {
        times = 1000;
        generator = new Random();
    }
    
    public int cast()
    {
        return 1 + generator.nextInt(times);
    }    
    public void add(double x)
    {
        sum = sum + x;
        if(count == 0 || maximum < x) maximum = x;
        count++;
    } 
    public double getAverage()
    {
        double avg = sum/count;
        return avg;
    } 
    public double getMaximum()
    {
        return maximum;
    } 
}
