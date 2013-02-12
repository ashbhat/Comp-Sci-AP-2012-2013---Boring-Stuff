import java.util.GregorianCalendar;
/**
 * Write a description of class VotingMachine here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class VotingMachine
{
    // instance variables - replace the example below with your own
    private int democratvotes;
    private int republicanvotes;
    private int totalvotes;
    
    public VotingMachine()
    {
      democratvotes = 0;
      republicanvotes = 0;
      totalvotes = 0;
    }

    public void republican()
    {
      republicanvotes = republicanvotes + 1;
      totalvotes = totalvotes + 1;
    }    
    
    public void democrat()
    {
      democratvotes = democratvotes + 1;
      totalvotes = totalvotes + 1;
    }
    
    public int getD()
    {
      return democratvotes;
    }
    
    public int getR()
    {
      return republicanvotes;
    }   
    
    public int getTotal()
    {
      return totalvotes;    
    }    
    
    public void cleanslate()
    {
      democratvotes = 0;
      republicanvotes = 0;
      totalvotes = 0;
    }

}
