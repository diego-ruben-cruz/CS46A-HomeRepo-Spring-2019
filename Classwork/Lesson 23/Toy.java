
/**
 * Write a description of class Toy here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Toy extends Product
{
    // instance variables - replace the example below with your own
    private int appAge;

    /**
     * Constructor for objects of class Toy
     */
    public Toy(String desc, double thePrice, int theAge)
    {
        super(desc, thePrice);
        appAge = theAge;
    }

    /**
     * Gets the appropriate age for this toy.
     *
     * @return    the appropriate age for this toy.
     */
    public int getAppropriateAge()
    {
        return appAge;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getDescription()
    {
        // put your code here
        return super.getDescription() + " Age: " + appAge;
    }
}
