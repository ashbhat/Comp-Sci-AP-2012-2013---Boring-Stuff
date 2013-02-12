
public class BugTester
{
    public static void main(String [] args)
    {
        Bug bugsy = new Bug(10);
        bugsy.move(); // now the position is 11
        bugsy.turn(); 
        bugsy.move(); // now the position is 10 
        bugsy.turn();
        bugsy.move();
        System.out.println("now the position is " + bugsy.getposition());
        System.out.println("expected 11");
    }
}
