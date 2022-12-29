
/**
 * Write a description of class CircleDrawer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleDrawer
{
    // instance variables - replace the example below with your own
    private int r;
    private int cx;
    private int cy;

    /**
     * Constructor for objects of class CircleDrawer
     */
    public CircleDrawer(int theR, int theX, int theY)
    {
        r = theR;
        cx = theX;
        cy = theY;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void draw()
    { 
        Ellipse circle = new Ellipse(cx+r, cy+r, 2*r, 2*r);
        circle.draw();
    }
    
    public static void main(String[] args)
    {
            CircleDrawer circle = new CircleDrawer(100,5,10);
            circle.draw();
    }
}

