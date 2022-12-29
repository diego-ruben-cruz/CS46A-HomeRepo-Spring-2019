
/**
 * Write a description of class Cube here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cube
{
    // instance variables - replace the example below with your own
    private double side = 0;

    /**
     * Constructor for objects of class Cube
     * 
     * @param num = The given side length
     * 
     */
    public Cube(double num)
    {
        // initialise instance variables
        side = num;
    }

    /**
     * Gets the side of the cube.
     * @return  The side of the cube in question.  
     */
    public double getSide()
    {
        // put your code here
        return side;
    }
    /**
     * Sets the side of the cube.
     * 
     * @param   newSide The new side given.
     *   
     */
    public void setSide(double newSide)
    {
        // put your code here
        side = newSide;
    }
    /**
     * Gets the surface area of the cube.
     * @return  The surface area of the cube.  
     */
    public double getSurfaceArea()
    {
        // put your code here
        double surfArea = 6.0*Math.pow(side,2);
        return surfArea;
    }
}
