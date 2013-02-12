import java.util.Scanner;
/**
 * Write a description of class ConverterTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ConverterTester
{
    public static void main(String args[])
{
    Scanner in = new Scanner(System.in);
    
    final double MILE_TO_KM = 1.609;
    
    System.out.println("How many miles would you like to convert?");
    double Miles = in.nextDouble();
    System.out.println("How many meters would you like to convert?");
    double Meters = in.nextDouble();
    
    Converter milesToMeters = new Converter(1000 * MILE_TO_KM);
    System.out.println("The number of Meters that are equivilent to your mile value is " + milesToMeters.converTo(20) + " meters");
    System.out.println("The number of Miles that are equivilent to your mile value is " + milesToMeters.converFrom(30000) + " miles");
}
}
