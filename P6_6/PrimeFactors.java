import java.util.Scanner;
/**
 * Write a description of class PrimeFactors here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrimeFactors
{
    // instance variables - replace the example below with your own
    private int x;
    public PrimeFactors(int number)
    {
        x = number;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void testprime()
    {
        for (int i=x; i>0; i--)
        {
            for(int j = 2; j<i; j++)
            {
             if(i%j == 0)
             {
                break;   
             }
             else if(j == i - 1)
             {
                 if (i == 3)
                 {
                 System.out.println(i);
                 System.out.println("2");
                 System.out.println("1");
                 }
                 else   
                 System.out.println(i);
             }  
        }    
    }
   }
   public static void main(String [] args)
   {
       Scanner input = new Scanner(System.in);
       System.out.println("What is your number?");
       int b = input.nextInt();
       PrimeFactors test = new PrimeFactors(b);
       System.out.println("Your prime numbers are as follows");
       test.testprime();
   }    
}
