import java.util.Random; 
public class Randoms

{
   public static void main(String [] args)
   
   {
       Random generator = new Random();
       int x = generator.nextInt(6);
       System.out.println(x);
   }    
}