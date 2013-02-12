import java.util.GregorianCalendar;
/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class BankAccount
{  
   private double balance;
   double rate;
   double numofedits;
   double freedits=2;
   double fee = 2;
   //10 free transactions
   public BankAccount(double x, double y)
   {   
      balance = x;
      rate = y;
   }
   public BankAccount(double initialBalance)
   {   
      balance = initialBalance;
   }
   public void setBalance(double amount)
   {  
      balance = amount;
   }
     
   public void deposit(double amount)
   {  
      balance = balance + amount;
      numofedits = numofedits + 1;
   }
   public void withdraw(double amount)
   {   
      balance = balance - amount;
      numofedits = numofedits + 1;
   }
   
   public void deductmonthlycharge()
   {
       double totalFees = (numofedits - freedits) * fee;
       balance = balance - totalFees;
       /*if (numofedits>10)
       {
           fee = 0.10*(numofedits - 10);
       }  
       else
       {
           fee = 0;
       }*/ 
       numofedits = 0;
   }  
   
   /*public void monthreset()
   {
       fee2 = fee2 + fee;
       numofedits = 0;
   }   */

   public double getBalance()
   {  
      //balance = balance - fee; 
      return balance;
   }
}