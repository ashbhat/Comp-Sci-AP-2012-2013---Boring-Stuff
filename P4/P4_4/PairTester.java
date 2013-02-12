
/**
 * Write a description of class PairTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PairTester
{
    public static void main(String[] args)
    {
    Pair myPair = new Pair(-2,11);
    System.out.println("sum: " + myPair.getSum());
    System.out.println("expected: 9");
    System.out.println("Difference:: " + myPair.getDifference());
    System.out.println("expected: -13");
    System.out.println("Product: " + myPair.getProduct());
    System.out.println("expected: -22");
    System.out.println("Average: " + myPair.getAverage());
    System.out.println("expected: 4.5");
    System.out.println("Distance: " + myPair.getDistance());
    System.out.println("expected: 13");
    System.out.println("Maximum: " + myPair.getMaximum());
    System.out.println("expected: 11");
    System.out.println("minimum: " + myPair.getMinimum());
    System.out.println("expected: -2");
    }    
}
