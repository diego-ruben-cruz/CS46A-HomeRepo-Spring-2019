
/**
 * Tests the LazyCritter class
 */
public class LazyCritterTester
{
    public static void main(String[] args)
    {
        //LazyCritter
        Critter lazy = new LazyCritter(5.2);
        lazy.move(2);
        lazy.move(4);
        lazy.move(-1);
        lazy.move(3);
        lazy.move(5);
        
        System.out.println(lazy.getHistory());
        System.out.println("Expected: [eat, sleep, eat, sleep, eat]");
        System.out.println(lazy.getWeight());
        System.out.println("Expected: 5.2");
        System.out.println(lazy.getPosition());
        System.out.println("Expected: 0");
    }
}
