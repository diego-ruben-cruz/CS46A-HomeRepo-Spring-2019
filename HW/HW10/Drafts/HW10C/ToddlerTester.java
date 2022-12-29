/**
 * Tester for the Toddler class
 */
public class ToddlerTester
{
    public static void main(String[] args)
    {
        Toddler toddler = new Toddler();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 4 null");
        
        toddler.run();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 4 null");
        toddler.run();
        
        toddler.sleep();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 4 null");
        
        toddler.sleep();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 4 null");
        
        System.out.println(Toddler.HAPPY);
        System.out.println("Expected: 1");
        
        System.out.println(Toddler.VERY_CRANKY);
        System.out.println("Expected: 7");
                
    }
}