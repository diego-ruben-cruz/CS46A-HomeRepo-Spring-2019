
/**
 * This class creates and manipulates circles.
 *
 * @author Diego Cruz
 * @version 2.13.19
 */
public class Circles
{
    private int x;
    private int y;
    private int diameter = 40;

    /**
     * Constructor for objects of class Circle
     * 
     * @param theX  The X-Coordinate.
     * @param theY  The Y-Coordinate.
     */
    public Circles(int theX, int theY)
    {
      x = theX;
      y = theY;
    }

    /**
     * Draws the Circles.
     *
     */
    public void draw()
    {
         Ellipse c1 = new Ellipse(x,y,40,40);
         c1.fill();
         c1.setColor(Color.RED);
    }
}
