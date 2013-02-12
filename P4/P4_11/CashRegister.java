/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double payment;
   private double numberofpurchases;
   private double allsales;
   private double dollars;
   private double quarters;
   private double nickels;
   private double dimes;
   private double pennies;
   private double change;
   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister()
   {
      purchase = 0;
      payment = 0;
      numberofpurchases = 0;
      allsales = 0;
      dollars = 0;
      quarters = 0;
      nickels = 0;
   }

   /**
      Records the sale of an item.
      @param amount the price of the item
   */
   public void recordPurchase(double amount)
   {
      double total = purchase + amount;
      allsales = total;
      purchase = total;
      numberofpurchases = numberofpurchases + 1;
   }

   /**
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
  public void enterPayment(int dol, int quart, int dim, int nick, int pen)
   {
      dollars = (double)dol;
      quarters = (double)quart;
      nickels = (double)nick;
      dimes = (double)dim;
      pennies = (double)pen; 
      payment = dollars + quarters/4+dimes/10+nickels/20+pennies/100;
   }
   public int giveDollars()
   {  
       change = payment - purchase;
       dollars = (int)change;
       return (int)change;
   }
   public int giveQuarters()
   {
       change = (change - dollars)*4;
       quarters = (int)change;
       return (int)change;
   }
   public int giveDimes()
   {
       change = (change - quarters)*2.5;
       dimes = (int)change;
       return (int)change;
   }
   public int giveNickels()
   {
      change = (change - dimes)*2;
      nickels = (int)change;
      return (int)change;
   }
   public int givePennies()
   {
      change = (change - nickels)*5;
      pennies = (int)change;
      return (int)change;
   }
   
  /*public double giveTotalSales()
   {
       return payment;
   }
   /*public void enterDollars(double amount)
   {
      dollars = amount*100;
   }
   
   public void enterQuarters(double amount)
   {
      quarters = amount*25;
   }
   public void enterDimes(double amount)
   {
      dimes = amount*10;
   }
   
   public void enterNickels(double amount)
   {
      nickels = amount*5;
   }
   public void enterPennies(double amount)
   {
      pennies = amount;
   }*/
   /*public double giveChange()
   {  
      payment = dollars + quarters + dimes + nickels + pennies; 
      change = payment/100 - purchase;
      purchase = 0;
      payment = 0;
      return change;
   } */
   
   
   
   /*public double giveTotal()
   {
       double num = numberofpurchases;
       return num;
   }    
   
   /*public double giveTotalSales()
   {
       double totes = allsales;
       return totes;
   } */   
}