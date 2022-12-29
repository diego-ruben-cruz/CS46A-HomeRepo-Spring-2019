
/**
 * Models a given word and manipulates it.
 *
 * @author DCruzin
 * @version 3.7.19
 */
public class Word
{
    // instance variables - replace the example below with your own
    private String term;

    /**
     * Constructor for objects of class Word
     * 
     * @param   theWord The given word.
     */
    public Word(String theWord)
    {
        // initialise instance variables
        term = theWord;
    }

    /**
     * Converts the word to leet.
     */
    public void toLeet()
    {
        // put your code here
        term = term.replace("a","4").replace("e","3").replace("t","7");
    }

    /**
     *
     * @return    The newly name-cased word.
     */
    public String toNameCase()
    {
        // put your code here
        String firstLetter = term.substring(0,1).toUpperCase();
        String nameCaseConvert = firstLetter + term.substring(1,term.length());
        return nameCaseConvert;
    }

    /**
     *  Prints out the current word.
     *
     * @return    Returns the current word.
     */
    public String getWord()
    {
        // put your code here
        return term;
    }
}
