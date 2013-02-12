
/**
 * Write a description of class Tester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tester
{
    public static void main(String args[])
    {
        IceCreamCone chocolate = new IceCreamCone(2,6);
        System.out.println("The surface area of the cone is " + chocolate.getSurfaceArea() + " inches sqaured");
        System.out.println("The volume of the cone is " + chocolate.getVolume() + " inches cubed");
    }    
}