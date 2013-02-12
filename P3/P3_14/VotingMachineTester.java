import java.util.GregorianCalendar;
public class VotingMachineTester
{
public static void main(String [] args)
{
VotingMachine SanJose = new VotingMachine();

SanJose.democrat();
SanJose.democrat();
SanJose.democrat();
SanJose.democrat();
SanJose.democrat();
SanJose.democrat();
SanJose.democrat();
SanJose.democrat();
SanJose.republican();
SanJose.republican();
SanJose.republican();
SanJose.republican();
SanJose.republican();
SanJose.republican();
SanJose.republican();
SanJose.republican();
String democrat = new String(" for the Democrat and ");
System.out.println("Out of " + SanJose.getTotal() + " votes the total votes in San Jose have been " + SanJose.getD() + democrat + SanJose.getR() + " for the republican");
SanJose.cleanslate();
System.out.println("Votes have now been reset");
}
}