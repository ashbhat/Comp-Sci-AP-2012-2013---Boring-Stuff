
/**
 * Write a description of class QuadraticTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class QuadraticTester
{
    public static void main(String[] args)
    {
        Quadratic myQuad = new Quadratic( 1, -4, 4);
        System.out.println("The two possible solutions are " + myQuad.getSolution1() + " and " + myQuad.getSolution2());
    }    
}
