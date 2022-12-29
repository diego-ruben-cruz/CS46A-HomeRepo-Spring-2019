
/**
 * Models a small cylindical package 
 * filled with crude oil 
 */
public class OilPackage
{
    //instance variables
    // define the instance variables (there are only 2)
    private double rad;
    private double height;
    //constants
    //define a constant for price of a barrel of oil($47)
    public static final double PRICE_OF_BARREL_OF_OIL = 47;
    //define a constant for cubic inches in a barrel (9,702)
    public static final double BARREL_VOL = 9702;
    //define a constant for cost of packaging
    public static final double PACK_COST = 3.5;
    
    /**
     * Constructor for objects of class OilPackage
     * @param theRadius the radius of the cylinder
     * @param theHeight the height of the cylinder
     */
    public OilPackage(double theRadius, double theHeight)
    {
        rad = theRadius;
        height = theHeight;
    }
    
    /**
     * Gets the volume of the cylinder
     * @return the volume of the cylinder
     */
    public double getVolume()
    {
        return (Math.PI*Math.pow(rad,2)*height);
    }
    
    /**
     * Gets the cost of the cylinder of oil plus 
     * cylinder package
     * @return the cost including oil and packaging
     */
    public double getCost()
    {
        //Use the getVolume method. 
        //Do not do the calculation of volume again here
        double oilCost = (this.getVolume()/BARREL_VOL)*PRICE_OF_BARREL_OF_OIL;
        return (oilCost+PACK_COST);
    }
    
    /**
     * Sets a new radius for this package
     * @param newRadius the new radius to set.
     */
    public void setRadius(double newRadius)
    {
        rad = newRadius;
    }
}
