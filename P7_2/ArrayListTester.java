import java.util.ArrayList;
import java.util.Scanner;
 public class ArrayListTester
 {
    public static void main(String[] args)
    {
        int a = 0;
      ArrayList<Dimes> accounts1 = new ArrayList<Dimes>();
      ArrayList<Pennys> accounts2 = new ArrayList<Pennys>();
      ArrayList<Nickels> accounts3 = new ArrayList<Nickels>();
      ArrayList<Quarters> accounts4 = new ArrayList<Quarters>();
      //ArrayList<Dimes> accounts = new ArrayList<Dimes>();
      Scanner input = new Scanner(System.in);
      System.out.println("How Pennys?");
      int b = input.nextInt();
      accounts2.add(new Pennys(b));
      System.out.println("How Nickels?");
      int c = input.nextInt();
      accounts3.add(new Nickels(c));
      System.out.println("How Dimes?");
      int d = input.nextInt();
      accounts1.add(new Dimes(d));
      System.out.println("How Quarters?");
      int e = input.nextInt();
      accounts4.add(new Quarters(e));
      
      
      /*accounts.add(new Dimes(1800));
      accounts.add(new BankAccount(1900));
      accounts.add(3, new BankAccount(1300));
      accounts.remove(0);*/
      
      System.out.println("(" + accounts2.get(0) + ", " +accounts3.get(0) + ", " +accounts1.get(0) + ", " +accounts4.get(0) + ")");
      /*System.out.println("Expected: 3");
      BankAccount first = accounts.get(0);
      System.out.println("First account number: " 
             + first.getAccountNumber());
      System.out.println("Expected: 1800");                  
      BankAccount last = accounts.get(accounts.size() - 1);
      System.out.println("Last account number: " 
             + last.getAccountNumber());
      System.out.println("Expected: 1300");      */            
    }
}