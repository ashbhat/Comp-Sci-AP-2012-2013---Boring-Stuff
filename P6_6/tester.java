import java.util.Scanner;
/**
 * Write a description of class tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tester
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("What's your number?");
        int x = input.nextInt();
        factoring new1 = new factoring(x);
        new1.nextFactor();
    }   
}
