/**
 * Tester for LoopsAndMore.
 *
 */
public class NumberLoopsPrinter1
{
    public static void main(String[] args)
    {
        NumberLoops loops = new NumberLoops();
        System.out.println(loops.sumEveryThird(21));
        System.out.println("Expected: 34992.0");
        System.out.println(loops.sumEveryThird(36));
        System.out.println("Expected: 1.5713647488E10");
        System.out.println(loops.sumEveryThird(3));
        System.out.println("Expected: 1.0");
        System.out.println(loops.sumEveryThird(-4));
        System.out.println("Expected: 1.0");
        
    }
}