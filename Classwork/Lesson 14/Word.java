
/**
 * A class with methods to manipulte a string
 */
public class Word
{
    private String word;

    /**
     * Constructs a Word class from the 
     * given string
     * @param theWord the string for ths 
     * Word class
     */
    public Word(String theWord)
    {
        word = theWord;
    }

    /**
     * Gets a string with all but the first 
     * character in reverse order
     * @return a string consisting of the the 
     * first character the String followed by 
     * the rest of the characters in reverse 
     * order. If the string is the empty string, return
     * the empty string
     * This should not alter the original String.
     */
    public String reverseAllButFirst() 
    {
        String result = "";
        if(!word.equals(""))
        {
            result = word.substring(0,1);
            for (int i = word.length()-1; i >= 1; i--) 
            {
                String ch = word.substring(i, i + 1);
                result = result + ch;
            }
            return result;
        }
        else
        {
            result = ""; 
            return result;
        }
    }

    /**
     * Gets the string for this Word
     * @return the string
     */
    public String getWord() 
    {
        return word;
    }

    /**
     * Sets a new String for this Word
     * @param newWord the String for this Word
     */
    public void setWord(String newWord) 
    {
        word = newWord;
    }

}
