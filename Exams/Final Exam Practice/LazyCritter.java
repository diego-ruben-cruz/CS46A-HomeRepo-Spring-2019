
/**
 * Write a description of class LazyCritter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LazyCritter extends Critter
{
    private String state; // hungry = true and 
    boolean lastState;

    /**
     * Constructor for objects of class LazyCritter
     */
    public LazyCritter(double theWeight)
    {
        super(theWeight);
        state = "hungry";
        lastState = true;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void move(int steps)
    {
        if (lastState == true)
        {
            super.addHistory("eat");
            lastState = false;
        }
        else
        {
            super.addHistory("sleep");
            lastState = true;
        }
    }
}
