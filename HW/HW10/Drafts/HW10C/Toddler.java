/**
 * Write a description of class Toddler here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Toddler
{
    // instance variables - replace the example below with your own
    public static final int HAPPY = 1;
    public static final int SOMEWHAT_CRANKY = 2;
    public static final int CRANKY = 4;
    public static final int VERY_CRANKY = 7;
    private int currentState;

    /**
     * Constructor for objects of class Toddler
     */
    public Toddler()
    {
        currentState = CRANKY;
    }

    /**
     * returns the current state of the toddler.
     *
     * @return    the current state of the toddler.
     */
    public int getState()
    {
        return currentState;
    }

    /**
     * The toddler runs and increases its cranky state by one level.
     *
     */
    public void run()
    {

    }

    /**
     * The toddler sleeps and decreases its cranky state by one level.
     *
     */
    public void sleep()
    {

    }

    /**
     * Gets the current mood of the baby in a string.
     *
     * @return    The current mood of the baby in words.
     */
    public String getMood()
    {
        // put your code here
        return null;
    }
}
