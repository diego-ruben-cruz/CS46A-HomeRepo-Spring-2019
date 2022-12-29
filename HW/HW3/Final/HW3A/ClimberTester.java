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
        System.out.println(climber1.getPosition());
        System.out.println("Expected: 5");
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
        
        Climber climber2 = new Climber("Thong", 9);
        climber2.climb();
        climber2.climb();
        climber2.climb();
        System.out.println(climber2.getName());
        System.out.println("Expected: Thong");
        System.out.println(climber2.getPosition());
        System.out.println("Expected: 12"); //note the position is beyond the end of the pole
        
    }
 
}