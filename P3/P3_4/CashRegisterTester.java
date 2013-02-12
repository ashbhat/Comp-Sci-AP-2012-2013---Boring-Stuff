/**
   A class to test the CashRegister class.
*/
public class CashRegisterTester
{
   public static void main(String[] args)
   {
      CashRegister register = new CashRegister(0.1);

      register.recordPurchase(29.50);
      register.recordPurchase(9.25);
      register.recordtaxablePurchase(20);
      register.enterPayment(50);

      double change = register.giveChange();
      double x = register.giveTotal();
      double y = register.giveTotalSales();
      double z = register.giveTotalTax();
      System.out.println("Give change of $" + change);
      System.out.println("Expected: -8.75");
      System.out.println("The tax at 10% has been $" + z);
      System.out.println("Total Number of purchases so far! --> " + x);
      System.out.println("Total Amount of sales so far! --> $" + y);
      System.out.println("The register sales will now be reset");
   }
}