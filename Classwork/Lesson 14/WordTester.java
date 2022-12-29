
/**
 * Tests the Word class.
 */
public class WordTester
{
    public static void main(String[] args)
    {
        Word myWord = new Word("hope");
        System.out.println(myWord.reverseAllButFirst()); 
        System.out.println("Expected: hepo");
        
        myWord = new Word("");
        System.out.println( myWord.reverseAllButFirst());
        System.out.println("Expected: ");
        
        myWord.setWord("spade");
        System.out.println( myWord.reverseAllButFirst());
        System.out.println("Expected: sedap");
    }
}
