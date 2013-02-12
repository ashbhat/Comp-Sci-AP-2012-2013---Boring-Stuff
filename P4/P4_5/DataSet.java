
/**
 * Write a description of class DataSet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataSet
{
    private int data;
    private int number;

    /**
     * Constructor for objects of class DataSet
     */
    public DataSet(int start)
    {
        data = start;
        number = 1;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void addvalue(int x)
    {
        data = x + data;
        number = number + 1;
    }
    
    public int getSum()
    {
        return data;
    }
    
    public double getAverage()
    {
        double average = data/number;
        return average;
    }    
}
