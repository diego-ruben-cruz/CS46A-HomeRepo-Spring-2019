/**
 * Models a television with a brand and a 
 * screen size in inches 
 */
public class TV 
{
    private double size;
    private String brand;

    /**
     * Constructor for objects of class TV
     */
    public TV(String theBrand, double theSize)
    {
        brand = theBrand;
        size = theSize;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getSize()
    {
        return size;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getBrand()
    {
        return brand;
    }

    /**
     * Gets a string representation of the object
     * @return a string representation of the object
     */
    public String toString()
    {
        String s = getClass().getName()
            + "[brand=" + brand
            + ",size=" + size 
            + "]";
        return s;
    }
}