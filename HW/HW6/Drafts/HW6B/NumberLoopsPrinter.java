/**
 * Tester for LoopsAndMore.
 *
 */
public class NumberLoopsPrinter
{
    public static void main(String[] args)
    {
        NumberLoops loops = new NumberLoops();

        System.out.println(loops.sumEveryThird(36));
        System.out.println("Expected: 1.5713647488E10");
        System.out.println(loops.sumEveryThird(3));
        System.out.println("Expected: 1.5713647488E10"); // does not give correct value in draft

        
    }
}