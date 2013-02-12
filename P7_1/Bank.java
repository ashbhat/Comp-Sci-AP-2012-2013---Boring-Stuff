//package big_java.ch07.bank;

import java.util.ArrayList;

/**
   This bank contains a collection of bank accounts.
*/
public class Bank
{   
   /**
      Constructs a bank with no bank accounts.
   */
   public Bank()
   {
      accounts = new ArrayList<BankAccount>();
   }
 
   /**
      Adds an account to this bank.
      @param a the account to add
   */
   public void addAccount(BankAccount a)
   //public void addAccount(BankAccount temp)
   {
     accounts.add(a);
   }
   
   /**
      Gets the sum of the balances of all accounts in this bank.
      @return the sum of the balances
   */
   public double getTotalBalance()
   {
      double total = 0;
      //for (BankAccount a : accounts)
      for(int i = 0; i < accounts.size(); i++)
      {
         total = total + accounts.get(i).getBalance();
         //total = total + a.getBalance();
      }
      return total;
   }

   /**
      Counts the number of bank accounts whose balance is at
      least a given value.
      @param atLeast the balance required to count an account
      @return the number of accounts having least the given balance
   */
   public int count(double atLeast)
   {
      int matches = 0;
      //for (BankAccount a : accounts)
      for(int i = 0; i < accounts.size(); i++)
      {
        if(accounts.get(i).getBalance() >= atLeast) matches++;
         //if (a.getBalance() >= atLeast) matches++; // Found a match
      }
      return matches;
   }

   /**
      Finds a bank account with a given number.
      @param accountNumber the number to find
      @return the account with the given number, or null if there
      is no such account
   */
   public BankAccount find(int accountNumber)
   {
      //for (BankAccount a : accounts)
          for(int i = 0; i < accounts.size(); i++)
      {
         if(accounts.get(i).getAccountNumber() == accountNumber)
             return accounts.get(i);
         //if (a.getAccountNumber() == accountNumber) // Found a match
         //   return a;
      } 
      return null; // No match in the entire array list
   }

   /**
      Gets the bank account with the largest balance.
      @return the account with the largest balance, or null if the
      bank has no accounts
   */
   public BankAccount getMaximum()
   {
      if (accounts.size() == 0) return null;
      BankAccount largestYet = accounts.get(0);
      for (int i = 1; i < accounts.size(); i++) 
      {
         BankAccount a = accounts.get(i);
         if (a.getBalance() > largestYet.getBalance())
            largestYet = a;
      }
      return largestYet;
   }
   
   public void printAccountInformation(){
       System.out.println("\nIn printAccountInformation BankAccount");
       for(BankAccount a: accounts){
           System.out.println("balance: $" + a.getBalance() +
                   " account number: " + a.getAccountNumber());
       }
   }
   private ArrayList<BankAccount> accounts;
   public static void main(String [] args)
   {
        System.out.println("Create your account!");
        
       
    }    
}