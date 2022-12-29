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
        int rad = 50;;
        int limit = 1;
        for(limit = 1; limit <= 6; limit++)
        {
            for(int count = 1; count <= limit; count++) // row
            {
                Ellipse c1 = new Ellipse (x, y, rad, rad);
                c1.setColor(Color.RED);
                c1.fill();
                x = x + 50;
            }
            x = 0;
            y = y + 50;
        }
    }
}