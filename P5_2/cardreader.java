
/**
 * Write a description of class cardreader here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cardreader
{
    private int x;
    private String j;
    private String k;
    private String r = "10";
    /**
     * Constructor for objects of class cardreader
     */
    public cardreader(String dad)
    {
        if (dad.length() == 3)
        {
            j = dad.substring(0,2);
            k = dad.substring(2,3);
        }
        else if(dad.length() == 2)
        {
            j = dad.substring(0,1);
            k = dad.substring(1,2);
        }
        else
        {
            j = "2";
            k = "C";
        }    
    }        
    
    
    
    public String getString()
    {
        if (j.equalsIgnoreCase("2"))
        {
            j = "two";
        }
        else if (j.equalsIgnoreCase("3"))
        {
            j = "three";
        } else if (j.equalsIgnoreCase("4"))
        {
            j = "four";
        }else if (j.equalsIgnoreCase("5"))
        {
            j = "five";
        }else if (j.equalsIgnoreCase("6"))
        {
            j = "six";
        }else if (j.equalsIgnoreCase("7"))
        {
            j = "seven";
        }else if (j.equalsIgnoreCase("8"))
        {
            j = "eight";
        }else if (j.equalsIgnoreCase("9"))
        {
            j = "nine";
        }else if (j.equalsIgnoreCase("10"))
        {
            j = "ten";
        }
        else if (j.equalsIgnoreCase("A"))
        {
            j = "Ace";
        } else if (j.equalsIgnoreCase("J"))
        {
            j = "Jack";
        } else if (j.equalsIgnoreCase("Q"))
        {
            j = "Queen";
        } else if (j.equalsIgnoreCase("K"))
        {
            j = "King";
        } 
        
        
        if (k.equalsIgnoreCase("D"))
        {
            k = "Diamonds";
        }
        else if (k.equalsIgnoreCase("H"))
        {
            k = "Hearts";
        } else if (k.equalsIgnoreCase("S"))
        {
            k = "Spades";
        } else if (k.equalsIgnoreCase("C"))
        {
            k = "Clubs";
        }    
        
        String a = j + " of " + k;
        return a;
    }
}
