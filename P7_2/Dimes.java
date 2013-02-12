public class Dimes
{  
    private int accountNumber;
    private double balance;


    public Dimes(int anAccountNumber)
    {   
     accountNumber = anAccountNumber;
     balance = 0;
    }
   
   public Dimes(int anAccountNumber, double initialBalance)
    {   
      accountNumber = anAccountNumber;
      balance = initialBalance;
    }
 
    public int getAccountNumber()
   {   
       return accountNumber;
    }
 
    /**
      Deposits money into the bank account.
       @param amount the amount to deposit
    */
    public void deposit(double amount)
   {  
     double newBalance = balance + amount;
      balance = newBalance;
   }

  public void withdraw(double amount)
   {
       double newBalance = balance - amount;
       balance = newBalance;
    }
 

  public double getBalance()
   {   
      return balance;
   } 
   
}