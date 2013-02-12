
/**
 * Write a description of class order here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class order
{
    // instance variables - replace the example below with your own
    private int x;
    private double f;
    private double s;
    private double t;
    private String h;
    /**
     * Constructor for objects of class order
     */
    public order(double x,double y,double z)
    {
        if (x > y)
        {
            if(x<z)
            {
                f = z;
                s = x;
                t = y;
            }
            else if(z<y)
            {
               t = z;
               f = x;
               s = y; 
            }
            else
            {
                f = x;
                s = y;
                t = z;
            }    
        }
        else
        {
            if(y<z)
            {
                f = z;
                s = y;
                t = x;
            }
            else if(z<x)
            {
               t = z;
               f = y;
               s = x; 
            }
            else
            {
                f = y;
                s = x;
                t = z;
            }   
        }
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public String getOrder()
    {
        if(t - (int)t > 0)
        {
            h = t+" "; 
        }
        else
        {
            h = (int)t+" ";    
        }    
        
        if(s - (int)s > 0)
        {
            h = h + s + " "; 
        }
        else
        {
            h = h + (int)s + " ";    
        }
        
        if(f - (int)f > 0)
        {
            h = h + f; 
        }
        else
        {
            h = h + (int)f + " ";    
        }
        
      /*  if(t - (int)f > 0)
        t = (int)t;
        else if(s - (int)s > 0)
        s = (int)s;
        else if(f - (int)f > 0)
        {
        f = (int)f;
    }*/
        return h;
    }
}
