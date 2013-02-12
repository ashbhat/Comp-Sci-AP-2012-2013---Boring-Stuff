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
        Scanner j = new Scanner(System.in);
        System.out.println("What is your input?");
        String a = j.nextLine();
        cardreader bob = new cardreader(a);
        System.out.println(bob.getString());
    }    
}
