/**
   This program tests the Bank class.
*/
public class BankTester
{
   public static void main(String[] args)
   {
      Bank firstBankOfJava = new Bank();
      firstBankOfJava.addAccount(new BankAccount(1001, 20000));
      firstBankOfJava.addAccount(new BankAccount(1015, 10000));
      firstBankOfJava.addAccount(new BankAccount(1729, 15000));

      firstBankOfJava.printAccountInformation();
      
      double threshold = 15000;
      System.out.println("\n(1).Testing how many accounts are greater " +
              "or equal than " + threshold);
      
      int c = firstBankOfJava.count(threshold);
      System.out.println("Count: " + c);
      System.out.println("Expected: 2");
      
      int accountNumber = 1015;
      
      //FINDING MATCHING PAGE 302 BIG JAVA
      System.out.println("\n(2).Testing if any account matches balance");
      BankAccount a = firstBankOfJava.find(accountNumber);
      if (a == null) 
         System.out.println("No matching account");
      else
         System.out.println("Balance of matching account: " + a.getBalance());
      System.out.println("Expected: 10000");
      
      System.out.println("\n(3).Testing which account has the largest balance");
            //FINDING THE MAXIMUM PAGE 302
      BankAccount max = firstBankOfJava.getMaximum();
      System.out.println("Account that has the largest balance: " 
            + max.getAccountNumber());
      System.out.println("Expected: 1001");
   }
}


/**
 Threshold: 
 1: the plank, stone, or piece of timber that lies under a door : sill
 2 a: gate, door b (1): end, boundary; specifically : the end of a runway (2): the place or point of entering or beginning : outset <on the threshold of a new age>
 3 a: the point at which a physiological or psychological effect begins to be produced <has a high threshold for pain> b: a level, point, or value above which something is true or will take place and below which it is not or will not
 * 
**/