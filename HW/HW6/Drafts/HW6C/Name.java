
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
}
