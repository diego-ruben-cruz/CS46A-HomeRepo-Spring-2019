
/**
 * Makes a robot and manipulates it.
 *
 * @author DCruzin
 * @version 2.15.2019
 */
public class Robot
{
    private Picture pic;

    /**
     * Constructor for objects of class Robot
     */
    public Robot(int theX, int theY)
    {
        pic = new Picture("myrobot.jpeg");
        pic.draw();
        this.stepHoriz(theX);
        this.stepVert(theY);
    }

    /**
     * Moves the robot to the right by the dimensions.
     *
     */
    public void moveRight()
    {
        this.stepHoriz(1);
    }

    /**
     * Moves the robot downwards by the dimensions.
     *
     */
    public void moveDown()
    {
        this.stepVert(1);
    }

    /**
     * Moves the robot horizonatally by the dimensions for a certain num of
     * times.
     *
     *@param units  The amount of times (+ right,- left) to move the pic.
     */
    public void stepHoriz(int units)
    {
        pic.translate(units * pic.getWidth(),0);        
    }

    /**
     * Moves the robot vertically by the dimensions for a certain num of
     * times.
     *
     *@param units  The amount of times (+ up,- down) to move the pic.
     */
    public void stepVert(int units)
    {
        pic.translate(0,units * pic.getHeight());
    }

    /**
     * Returns the x coordinate of location.
     *
     *@return   The x coordinate.
     */
    public int getX()
    {
        return pic.getX()/pic.getWidth();
    }

    /**
     * Returns the y coordinate of location.
     *
     *@return   The y coordinate.
     */
    public int getY()
    {
        return pic.getY()/pic.getWidth();
    }
}
