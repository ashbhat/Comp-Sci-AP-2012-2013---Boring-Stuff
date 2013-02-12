
/**
 * Write a description of class Purse here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Purse
{
    public static void main(String[] args)
    {
      ArrayList<BankAccount> accounts = new ArrayList<BankAccount>();
      accounts.add(new BankAccount(999));
      accounts.add(new BankAccount(1800));
      accounts.add(new BankAccount(1900));
      accounts.add(3, new BankAccount(1300));
      accounts.remove(0);

      System.out.println("Size: " + accounts.size());
      System.out.println("Expected: 3");
      BankAccount first = accounts.get(0);
      System.out.println("First account number: " 
             + first.getAccountNumber());
      System.out.println("Expected: 1800");                  
      BankAccount last = accounts.get(accounts.size() - 1);
      System.out.println("Last account number: " 
             + last.getAccountNumber());
      System.out.println("Expected: 1300");                  
    }
}
