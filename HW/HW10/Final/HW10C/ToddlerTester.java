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
        System.out.println("Expected: 4 Cranky");
        
        toddler.run();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 7 Very cranky");
        toddler.run();
        
        toddler.sleep();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 4 Cranky");
        
        toddler.sleep();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 2 Somewhat cranky");
        
        toddler.sleep();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 1 Happy");
        
        toddler.sleep();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 1 Happy");
        
        toddler.run();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 2 Somewhat cranky");
        
        toddler.run();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 4 Cranky");
        
        toddler.run();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 7  Very cranky");
        
        toddler.run();
        System.out.println("state: " + toddler.getState()
            + " " + toddler.getMood());
        System.out.println("Expected: 7  Very cranky");
                
    }
}