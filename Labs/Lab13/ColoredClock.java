
/**
 * Write a description of class ColoredClock here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ColoredClock extends Clock
{
    /**
     * Constructor for objects of class ColoredClock
     */
    public ColoredClock()
    {

    }

    public void draw()
    {
        int currentTime = super.getHours();
        Color color = Color.BLUE;
        if(currentTime >= 6 && currentTime < 18)
        {
            color = Color.YELLOW;
        }
        Ellipse circle = new Ellipse(getX(), getY(), 2 * RADIUS, 2 * RADIUS);
        circle.setColor(color);
        circle.fill(); 
        super.draw();
    }

    // public void update()
    // {
        // super.update();
        // super.setHours((super.getHours() + 12) % 24);
    // }

}
