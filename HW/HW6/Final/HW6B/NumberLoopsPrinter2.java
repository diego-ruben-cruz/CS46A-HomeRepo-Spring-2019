/**
 * Tester for LoopsAndMore.
 *
 */
public class NumberLoopsPrinter2
{
    public static void main(String[] args)
    {
        NumberLoops loops = new NumberLoops();

        System.out.println("limit 100: \n" + loops.printNumbersUpTo(100) );
        System.out.println("limit 12: \n" + loops.printNumbersUpTo(12) );
        System.out.println("No output: " + loops.printNumbersUpTo(-2) );  
    }
}