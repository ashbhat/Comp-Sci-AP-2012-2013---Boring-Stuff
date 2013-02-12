
/**
 * Write a description of class DataSetTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DataSetTester
{
   public static void main(String[] args)
   {
      DataSet myset = new DataSet(5);
      
      myset.addvalue(20);
      myset.addvalue(20);
      myset.addvalue(20);
      myset.addvalue(20);
      
      System.out.println("The sum is " + myset.getSum() + " and the average is " + myset.getAverage());
}}
