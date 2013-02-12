
public class SavingsAccountTester
{
   public static void main(String[] args)
   {
      SavingsAccount momSavings = new SavingsAccount(1000, 10);
      momSavings.addInterest();
      System.out.println(momSavings.getBalance());
      System.out.println("Expected: 1100");      
   }
}