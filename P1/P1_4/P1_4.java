import javax.swing.JOptionPane;

public class P1_4

{public static void main(String[] args)
{
        String name = JOptionPane.showInputDialog("What's your name?");
        
        System.out.println("0           0");
        //eyes
        System.out.println(" | {0} {0} |     _______^^________  ");   
        //facecontinued
        System.out.println(" |    w    |    |                 | ");
        //mouth
        System.out.print(" (     o   )   <Hello ");
        System.out.print(name);
        System.out.println("! How are you?|");
        //chin
        System.out.println(" |____^____|    |_________________| ");  
}}