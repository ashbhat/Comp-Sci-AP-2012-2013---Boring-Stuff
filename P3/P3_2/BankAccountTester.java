/**
   A class to test the BankAccount class.
*/
public class BankAccountTester
{
   /**
      Tests the methods of the BankAccount class.
      @param args not used
   */
   public static void main(String[] args)
   {
      BankAccount momSavings = new BankAccount();
      momSavings.addInterest(10);
      System.out.println(momSavings.getBalance());
      System.out.println("Expected: 1100");      
   }
}