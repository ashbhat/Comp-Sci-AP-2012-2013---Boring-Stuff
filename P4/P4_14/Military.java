import java.lang.Math;
/**
 * Write a description of class Military here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Military
{
    private int x;
    private double time1;
    private double time2;
    private double hours;
    private int minutes;
    private double time;
    public Military(int a, int b)
    {
        int j1 = (a/100)*60;
        int j2 = (a%100)*(100/60);
        time1 = j1+j2;
        int k1 = (b/100)*60;
        int k2 = (b%100)*(100/60);
        time2 = k1+k2;
        time = (time2-time1)/60;
        hours = time;
        minutes = (int)(time2-time1)%60;
    }
    
    public String getHours()
    {
       String abc = (int)hours + " hours " + minutes + " minutes";
       return abc;
    }
}
