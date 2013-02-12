import java.util.Scanner;
import java.awt.Color;
import java.awt.Graphics;

/**
 * Write a description of class MilitaryTester here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MilitaryTester
{
     public static void main(String args[])
   {
       Scanner user_input = new Scanner(System.in);
       int time1;
       System.out.println("Type in your first number!");
       time1 = user_input.nextInt();
       int time2;
       System.out.println("Type in your second number!");
       time2 = user_input.nextInt();
        Military time = new Military(time1,time2);
        System.out.println(time.getHours());
}
}
