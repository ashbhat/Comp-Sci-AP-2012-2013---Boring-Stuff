
/**
 * Write a description of class factoring here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class factoring
{
    // instance variables - replace the example below with your own
    private int x;
    
    /**
     * Constructor for objects of class factoring
     */
    public factoring(int numberToFactor)
    {
        x = numberToFactor;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void nextFactor()
    {
        for(int i = 2; i<1000; i++)
        {
             if(x%i == 0)
             {
                x = x/i;
                System.out.println(i);
                int test = x%1;
                i =2;
                /*for(test = 0; i!=1;)
                {
                   x = x/i;
                   System.out.println(i);
                   test = x%i;
                   i=1;
                }*/    
             }      
        }    
    }
     
}
