/**
 * Draws some circle objects in different locations.
 * 
 * @author DCruzin
 */
public class CirclesViewer
{
    public static void main(String[] args)
    {
        int x = 0;
        int y = 10;
        int rad = 50;
        for(int count = 6; count > 0; count--) // column 1
        {
            Ellipse c1 = new Ellipse (x, y, rad, rad);
            c1.setColor(Color.RED);
            c1.fill();
            y = y + 50;
        }
    }
}