/**
 * Tests the Climber class
 * 
 * @author Kathleen O'Brien
 *
 */
public class ClimberTester
{
    public static void main(String[] arg)
    {
        Climber climber1 = new Climber("Carlos", 5);
        System.out.println(climber1.getName());
        System.out.println("Expected: Carlos");
        climber1.slide();
        climber1.climb();
        climber1.climb();
        System.out.println(climber1.getPosition());
        System.out.println("Expected: 0"); //note that the position will not be correct
        climber1.setName("Maria");
        System.out.println(climber1.getName()); //note name did not change
        System.out.println("Expected: Carlos");

        Climber climber2 = new Climber("Thong", 6);
        System.out.println(climber2.getName());
        System.out.println("Expected: Thong");
    }
}