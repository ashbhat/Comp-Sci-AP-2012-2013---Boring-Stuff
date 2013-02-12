/**
   A cash register totals up sales and computes change due.
*/
public class CashRegister
{
   private double purchase;
   private double taxpurchase;
   private double payment;
   private double numberofpurchases;
   private double allsales;
   private double tax;
   private double taxrate;

   /**
      Constructs a cash register with no money in it.
   */
   public CashRegister(double rate)
   {
      taxrate = rate; 
      payment = 0;
      numberofpurchases = 0;
      allsales = 0;
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
      //tax = total * 0.1;
      //double totalwithtax = tax;
      numberofpurchases = numberofpurchases + 1;
   }
   
   public void recordtaxablePurchase(double amount)
   { 
      double taxtotal = amount;
      taxpurchase = taxtotal;
      purchase = purchase + taxpurchase;
      allsales = allsales + taxpurchase;
      tax = taxtotal * taxrate;
      double totalwithtax = tax;
      numberofpurchases = numberofpurchases + 1;
   }

   /**
      Enters the payment received from the customer.
      @param amount the amount of the payment
   */
   public void enterPayment(double amount)
   {
      payment = amount;
   }
  
   
   /**
      Computes the change due and resets the machine for the next customer.
      @return the change due to the customer
   */
   public double giveChange()
   {   
      double change = payment - purchase;
      purchase = 0;
      payment = 0;
      return change;
   }
   public double giveTotal()
   {
       double num = numberofpurchases;
       return num;
   }    
   
   public double giveTotalSales()
   {
       double totes = allsales;
       return totes;
   }    
   /* public void recordtaxablePurchase(double amount)
   { 
      double pretotal = purchase + amount;
      allsales = pretotal;
      purchase = pretotal;
      tax = pretotal * 0.1;
      double total = purchase + tax + amount;
      numberofpurchases = numberofpurchases + 1;
   }*/
   public double giveTotalTax()
   {
       double totaltax = tax;
       return totaltax;
   } 
}