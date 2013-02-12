
/**
 * Write a description of class car here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class car
{
    // instance variables - replace the example below with your own
    private double milesgallon;
    private double gas;

    /**
     * Constructor for objects of class car
     */
    public car(double mpg)
    {
        milesgallon = mpg;
        gas = 0;
    }
    
    public void addGas(double amount)
    {
       gas = gas + amount;
    }  
    
    public void drive(double distance)
    {
       gas = gas - distance/milesgallon;
    } 

    public double getGasInTank()
    {
        double left = gas;
        return left;
    }    
}
