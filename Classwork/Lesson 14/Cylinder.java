/**
 * Models a cylinder.
 * 
 */
public class Cylinder
{
    private double height;
    private double radius; 
    
    /**
     * Constructor for objects of class Cylinder
     * @param theHeight the height of cylinder in cm
     * @param theRadius radius of cylinder in cm
     */
    public Cylinder(double theHeight, double theRadius)
    {
        height = theHeight;
        radius = theRadius;
    }
    
    /**
     * Sets the height of the cylinder
     * @param newHeight the new height of the cylinder
     */
    public void setHeight(double newHeight)
    {
        height = newHeight;

    }

    /**
     * Gets the volume of this cylinder 
     * @return the volume of the cylinder
     */
    public double getVolume()
    {
        double areaOfCircle = Math.PI * radius * radius;
        double volume = areaOfCircle * height;
        return volume;
    }
}