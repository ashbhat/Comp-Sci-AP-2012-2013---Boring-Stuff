
/**
 * Write a description of class Roach here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Roach
{
    // instance variables - replace the example below with your own
    private int x;
    private int population; 
    /**
     * Constructor for objects of class Roach
     */
    public Roach(int roaches)
    {
        population = roaches;
    }
    
    public void insecticide()
    {
        population = population - population/10;
    }
    
    public void breed()
    {
        population = population*2;    
    }    
    
    public int getRoaches()
    {
        int populationr = population;
        return populationr;
    }    
}
