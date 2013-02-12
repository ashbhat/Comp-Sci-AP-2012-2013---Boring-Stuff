
/**
 * Write a description of class SimpleLetter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Product
{
    private double Price;
    private String name;
    double reduce;
    public Product (String x, double y, double z)
    {
        name = x;
        Price = y;
        reduce = z;
    }    
    
    public double getPrice()
   {   
      return Price;
   }
   
    public double reduce()
    {
        Price = Price - reduce;
        return Price;
    }
   
   public String getname()
   {
       return name;
   }    
   
}
