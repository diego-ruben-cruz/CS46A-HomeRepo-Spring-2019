/**
 * Tester for the Word class
 *
 * @author KOBrien
 * @version (a version number or a date)
 */
public class WordTester
{
    public static void main(String[] args)
    {
        Word word = new Word("taken");
        System.out.println("Name case: " + word.toNameCase());
        System.out.println("Expected: Taken");
        System.out.println("original word:" + word.getWord());
        System.out.println("Expected: taken");
        word.toLeet();
        System.out.println("replacements: " +word.getWord());                
        System.out.println("Expected: 74k3n");
        
        word = new Word("leet");
        System.out.println("Name case: " + word.toNameCase());
        System.out.println("Expected: Leet");
        word.toLeet();
        System.out.println("replacements: " +word.getWord());               
        System.out.println("Expected: l337");
                
        word = new Word("goodBye");
        System.out.println("Name case: " + word.toNameCase());
        System.out.println("Expected: Goodbye");

        
        
    }
}