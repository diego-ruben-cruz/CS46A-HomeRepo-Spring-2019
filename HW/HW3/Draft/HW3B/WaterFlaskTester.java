/**
 * Tester for the WaterFlask class
 *
 */
public class WaterFlaskTester
{
    public static void main(String[] args)
    {
        WaterFlask flask = new WaterFlask(600);
        System.out.println(flask.getMaxCapacity());
        System.out.println("Expected: 600");
        
        System.out.println(flask.getAmount());
        System.out.println("Expected: 0"); 
        
        flask.drink(100);
        System.out.println(flask.getAmount());
        System.out.println("Expected: 0");
              
        flask.fill();
        System.out.println(flask.getAmount());
        System.out.println("Expected: 0");               
    }   
}