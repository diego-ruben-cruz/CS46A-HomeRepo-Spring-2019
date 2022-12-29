
/**
 * Write a description of class WorldClock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WorldClock extends Clock
{
    // instance variables - replace the example below with your own
    private String label;
    private int offset;

    /**
     * Constructor for objects of class WorldClock
     */
    public WorldClock(String theName, int theOffset)
    {
        label = theName;
        offset = theOffset;
    }

    public void update()
    {
        super.update();
        int difference = super.getHours() + offset;
        if(difference < 0)
        {
            difference = difference / -1;
        }
        super.setHours((difference) % 24);
    }

    public void draw()
    {
        Rectangle bounds = getBounds();
        double x = bounds.getX();
        double y = bounds.getY();
        Text text = new Text(x, y, label);
        text.draw();
        super.draw();
    }
}
