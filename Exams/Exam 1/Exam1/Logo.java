
/**
 * Models a logo that can be printed at various given (x,y) values.
 *
 * @author DCruzin
 * @version 3.7.19
 */
import javax.swing.JFrame;
public class Logo
{
    // instance variables - replace the example below with your own
    private int x;
    private int y;

    /**
     * Constructor for objects of class Logo
     * 
     * @param   theX    the given x coordinate.
     * 
     * @param   theY    the given y coordinate.
     * 
     */
    public Logo(int theX, int theY)
    {
        // initialise instance variables
        x = theX;
        y = theY;
    }

    /**
     * Draws the logo using a given set of coordinates.
     *
     */
    public void draw()
    {
        Ellipse redCircle = new Ellipse(x, y, 40, 40);
        redCircle.setColor(Color.RED);
        redCircle.fill();
        Ellipse yelCircle = new Ellipse(x, y + 40, 40, 40);
        yelCircle.setColor(Color.YELLOW);
        yelCircle.fill();
        Ellipse bluCircle = new Ellipse(x, y + 80, 40, 40);
        bluCircle.setColor(Color.BLUE);
        bluCircle.fill();
        Line centerLine = new Line(x + 20, y + 20, x + 20, y + 100);
        centerLine.draw();
    }
}
