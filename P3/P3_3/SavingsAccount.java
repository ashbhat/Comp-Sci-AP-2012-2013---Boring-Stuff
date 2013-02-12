/**
   A bank account has a balance that can be changed by 
   deposits and withdrawals.
*/
public class SavingsAccount
{  
   private double balance;
   double rate;
   public SavingsAccount(double x, double y)
   {   
      balance = x;
      rate = y;
   }
   public SavingsAccount(double initialBalance)
   {   
      balance = initialBalance;
   }
   public void setBalance(double amount)
   {  
      balance = amount;
   }
   public void addInterest()
   {   
      balance = balance * rate/100 + balance;
   }
   public void deposit(double amount)
   {  
      balance = balance + amount;
   }
   public void withdraw(double amount)
   {   
      balance = balance - amount;
   }
   public double getBalance()
   {   
      return balance;
   }
}