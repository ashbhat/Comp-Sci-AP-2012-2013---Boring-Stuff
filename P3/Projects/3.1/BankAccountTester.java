
public class BankAccountTester
{
   public static void main(String[] args)
   {
      BankAccount momSavings = new BankAccount(20, 10);
      momSavings.deposit(20);
      momSavings.withdraw(5);
      momSavings.deposit(5);
      momSavings.deductmonthlycharge();
      System.out.println("Total money left in your bank  " + momSavings.getBalance());
      /*momSavings.deposit(5);
      momSavings.chargingfeechecker();
      momSavings.monthreset();
      momSavings.deposit(20);
      momSavings.deposit(20);
      momSavings.deposit(20);
      momSavings.deposit(20);
      momSavings.deposit(20);
      momSavings.withdraw(20);
      momSavings.withdraw(20);
      momSavings.withdraw(20);
      momSavings.withdraw(20);
      momSavings.withdraw(20);
      momSavings.withdraw(5);
      momSavings.deposit(5);
      momSavings.chargingfeechecker();
      momSavings.monthreset();
      momSavings.deposit(20);
      momSavings.deposit(20);
      momSavings.deposit(20);
      momSavings.deposit(20);
      momSavings.deposit(20);
      momSavings.withdraw(20);
      momSavings.withdraw(20);
      momSavings.withdraw(20);
      momSavings.withdraw(20);
      momSavings.withdraw(20);
      momSavings.withdraw(5);
      momSavings.deposit(5);
      momSavings.chargingfeechecker();
      momSavings.monthreset();*/
       
   }
}