
/**
 * Models a Big Balloon.
 *
 * @author DCruzin
 * @version 2.19.19
 */
public class HeliumBalloon
{
    // instance variables - replace the example below with your own
    private double rad;
    public static final int CUBIC_INCHES_PER_CUBIC_FOOT = 1728; 
    public static final double PROFIT = 2.0;
    public static final double PRICE_OF_BALLOON = 5.50;
    public static final double PRICE_OF_TANK = 235.00;
    public static final int VOLUME_OF_TANK_IN_CUBIC_FEET = 300;

    /**
     * Constructor for objects of class HeliumBalloon
     * @param theRad    The Radius of the balloon.
     */
    public HeliumBalloon(double theRad)
    {
        // initialise instance variables
        rad = theRad;
    }

    /**
     * Obtains Radius.
     *
     * @return    the Radius.
     */
    public double getRadius()
    {
        // put your code here
        return rad;
    }
    /**
     * Sets a new Radius.
     *
     * @param   newRad  The new Radius.
     */
    public void setRadius(double newRad)
    {
        // put your code here
        rad = newRad;
    }
}
