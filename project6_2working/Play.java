import java.util.Random;
import java.util.Scanner;
/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play
{
    public Play()
    {
    }

    public static void main(String [] args)
   {
        Scanner input = new Scanner(System.in);
        Random number = new Random();
        int a = number.nextInt(2);
        int turn = number.nextInt(2);
        int size = number.nextInt(91) + 10;
        Pile sized = new Pile(size);
        int d = 0;
   if (turn == 1)
        //human goes first
        {
        System.out.println("You go first!");    
        if(a == 1)
        {
            System.out.println("Smart Mode Activated");   
           while(size > 0)
            {
                int j = size;
                System.out.println("There are currently " + j + "marbles");
                if(j!=1&&j!=3&&j!=7&&j!=15&&j!=31&&j!=63)
               {
               d = number.nextInt(j/2) + 1;
               sized.take(d);
               size = sized.left();
               }
               else{
               int r = number.nextInt(5);
               sized.take(r);
               size = sized.left();
               }
               if (size<=0)
               {
               System.out.println("Done, Player Wins");
               break;
               } 
            //dumb computer mode
            System.out.println("What is your number?");
            d = input.nextInt();
            sized.take(d);
               //computer
               j = sized.left() + 1;
               if (j<=0)
               {
               System.out.println("Done, Computer Wins");
               break;
               }
               size = sized.left();
               
           } 
        }
        else
        { 
           System.out.println("Dumb Mode Activated");     
            while(size > 0)
            {
            //dumb computer mode
            int j = size;
            System.out.println("There are currently " + j + "marbles");
            System.out.println("What is your number?");
            d = input.nextInt();
            sized.take(d);
               //computer
               j = sized.left() + 1;
               if (j<=0)
               {
               System.out.println("Done, Computer Wins");
               break;
               }    
               d = number.nextInt(j/2) + 1;
               sized.take(d);
               size = sized.left();
               if (size<=0)
               {
               System.out.println("Done, Player Wins");
               break;
               } 
           }
        }
    }     
    
        else
    {
        System.out.println("Computer goes first :O"); 
        //computer goes first
        if(a == 1)
        {
             System.out.println("Smart Mode Activated");   
           while(size > 0)
            {
                int j = size;
            System.out.println("There are currently " + j + "marbles");
            if(j!=1&&j!=3&&j!=7&&j!=15&&j!=31&&j!=63)
               {
               d = number.nextInt(j/2) + 1;
               sized.take(d);
               size = sized.left();
               }
               else{
               int r = number.nextInt(5);
               sized.take(r);
               size = sized.left();
               }
               if (size<=0)
               {
               System.out.println("Done, Player Wins");
               break;
               } 
            System.out.println("What is your number?");
            d = input.nextInt();
            sized.take(d);
               //computer
               j = sized.left() + 1;
               if (j<=0)
               {
               System.out.println("Done, Computer Wins");
               break;
               }
               
               if(j!=1&&j!=3&&j!=7&&j!=15&&j!=31&&j!=63)
               {
               d = number.nextInt(j/2) + 1;
               sized.take(d);
               size = sized.left();
               }
               else{
               int r = number.nextInt(5);
               sized.take(r);
               size = sized.left();
               }
               if (size<=0)
               {
               System.out.println("Done, Player Wins");
               break;
               } 
           } 
        }
        else
        { 
             System.out.println("Dumb Mode Activated");   
           while(size > 0)
            {
                int j = size;
            System.out.println("There are currently " + j + "marbles");
            //dumb computer mode
            System.out.println("What is your number?");
            d = input.nextInt();
            sized.take(d);
               //computer
               j = sized.left() + 1;
               if (j<=1)
               {
               
               System.out.println("Done, Computer Wins");
               break;
               }    
               d = number.nextInt(j/2) + 1;
               sized.take(d);
               size = sized.left();
               if (size<=0)
               {
               System.out.println("Done, Player Wins");
               break;
               } 
           }
        }        
   }    
   }    
}
