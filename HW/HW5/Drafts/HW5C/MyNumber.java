
/**
 * Models a number that is manipulated by commands.
 *
 * @author DCruzin
 * @version 2.28.2019
 */
public class MyNumber
{
    // instance variables - replace the example below with your own
    private int input;

    /**
     * Constructor for objects of class MyNumber
     * 
     * @param firstInt  The initial value of the integer.
     */
    public MyNumber(int firstInt)
    {
        // initialise instance variables
        input = firstInt;
    }

    /**
     * Gets the current value of the integer.
     *
     * @return    The current number
     */
    public int getNumber()
    {
        // put your code here
        if (input < 0)
        {
        input = input * -1;
        }
        
        return input;
    }
}
