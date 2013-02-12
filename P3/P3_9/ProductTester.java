
/**
 * Write a description of class ProductTester here.
 * 
 * @author (Ash) 
 * @version (1.0)
 */
public class ProductTester
{
   {
      Product toaster = new Product("Toaster", 29.95, 5);
      System.out.println(toaster.getname() + " original price $" + toaster.getPrice() + " reduced price $" + toaster.reduce());      
      System.out.println("Expected: $24.95");
      Product iphone = new Product("iPhone 5", 200, 5);
      System.out.println(iphone.getname() + " original price $" + iphone.getPrice() + " walmart price $" + iphone.reduce());      
      System.out.println("Expected: $195.0");
   }
}
