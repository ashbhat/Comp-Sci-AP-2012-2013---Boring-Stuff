
public class RoachTester
{

    public static void main(String [] args)
    {
        Roach sam = new Roach(10);
        sam.breed(); //every breeding expands population by 200%
        sam.insecticide(); //every spray kills off 10%
        System.out.println("After the insecticide and breeding poor sam's population is now " + sam.getRoaches());
        sam.breed(); //every breeding expands population by 200%
        sam.insecticide(); //every spray kills off 10%
        System.out.println("After the insecticide and breeding poor sam's population is now " + sam.getRoaches());
        sam.breed(); //every breeding expands population by 200%
        sam.insecticide(); //every spray kills off 10%
        System.out.println("After the insecticide and breeding poor sam's population is now " + sam.getRoaches());
        sam.breed(); //every breeding expands population by 200%
        sam.insecticide(); //every spray kills off 10%
        System.out.println("After the insecticide and breeding poor sam's population is now " + sam.getRoaches());
    }

}
