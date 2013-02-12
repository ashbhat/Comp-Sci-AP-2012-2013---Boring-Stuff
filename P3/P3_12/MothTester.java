
public class MothTester
{
  public static void main(String [] args)
  {
    Moth albert = new Moth(20);
    albert.moveToLight(60);
    albert.moveToLight(60);
    albert.moveToLight(60);
    System.out.println("The position is now " + albert.getPosition());
    System.out.println("Expected = 55");
  }   
}
