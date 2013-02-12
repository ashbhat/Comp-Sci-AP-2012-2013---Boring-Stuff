
/**
 * Write a description of class Simulator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Simulator
{
   public static void main(String [] args)
   {
        Randomizer tester = new Randomizer();
        final int TRIES = 100;
        for (int i = 1; i <= TRIES; i++)
        {
            int n = tester.cast();
            System.out.print(n + " ");
            tester.add(n);
        }    
        System.out.println();
        System.out.println("The Average of the values is " + tester.getAverage());
        System.out.println("The Maximum of the values is " + tester.getMaximum());
   }    
}
