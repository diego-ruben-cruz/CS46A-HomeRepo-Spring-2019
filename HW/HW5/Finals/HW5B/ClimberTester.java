
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
        //regression test 
        Climber climber1 = new Climber("Carlos", 5);
        System.out.println(climber1.getName());
        System.out.println("Expected: Carlos");
        climber1.climb();
        climber1.climb();
        climber1.climb();
        System.out.println(climber1.getPosition());
        System.out.println("Expected: 8");
        climber1.slide();
        System.out.println(climber1.getPosition());
        System.out.println("Expected: 0");
        climber1.setName("Maria");
        System.out.println(climber1.getName()); 
        System.out.println("Expected: Maria");

        //test setting name and bad position in constructor
        Climber climber2 = new Climber("James", -5);
        System.out.println(climber2.getName());
        System.out.println("Expected: Jimmy");
        System.out.println(climber2.getPosition());
        System.out.println("Expected: 0");
        climber2 = new Climber("Thong", 11);
        System.out.println(climber2.getPosition());
        System.out.println("Expected: 10");
        climber2.climb();
        climber2.climb();
        climber2.climb();
        System.out.println(climber2.getPosition());
        System.out.println("Expected: 10"); 

        //test setName
        climber2.setName("James");
        System.out.println(climber2.getName()); 
        System.out.println("Expected: Jimmy");              
    }
}