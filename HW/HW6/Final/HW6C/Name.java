
/**
 * Models a name string and modifies it.
 *
 * @DCruzin
 * @3.12.19
 */
public class Name
{
    // instance variables - replace the example below with your own
    private String pName;

    /**
     * Constructor for objects of class Name
     * 
     * @param   initName    The initial name.
     * 
     */
    public Name(String initName)
    {
        pName = initName;
    }

    /**
     * Puts the letter of the string in a list.
     *
     * @return    the list of letters
     */
    public String listLetters()
    {
        String toConstruct = "";
        for(int i = 0; i < pName.length(); i++)
        {
            toConstruct = toConstruct + pName.substring(i, i + 1) + " \n";
        }
        return toConstruct;
    }

    /**
     * Gets the name.
     *
     * @return    The current name.
     */
    public String getName()
    {
        return pName;
    }

    /**
     * Gets the amount of consonants in the name.
     *
     * @return    The current name.
     */
    public int consonants()
    {
        int count = 0;
        String consonants = "bcdfghjklmnpqrstvwxyz";
        for (int placeHold = 1; placeHold <= pName.length(); placeHold++)
        {
            String subChar = pName.substring(placeHold - 1, placeHold);
            String lcChar = subChar.toLowerCase();
            if(consonants.contains(lcChar))
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Retrieves the initials of the name.
     *
     * @return    The initials of the name.
     */
    public String initials()
    {
        String result = pName.substring(0,1);
        int futureIndex = pName.indexOf(" ", pName.indexOf(" "));
        for(int count = 0; count < pName.length(); count++)
        {
            if(futureIndex != -1)
            {
                result = result + 
                pName.substring(futureIndex + 1 , futureIndex + 2);
                futureIndex = pName.indexOf(" ", futureIndex+1);
            }
        }
        return result;
    }
}
