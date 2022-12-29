import java.util.ArrayList;
public class RectangleManager
{
    private ArrayList<Rectangle> boxes;

    public RectangleManager()
    {
        boxes = new ArrayList<Rectangle>();
    }

    public void add(Rectangle r)
    {
        boxes.add(r);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Rectangle maxWidth()
    {
        if (boxes.size() == 0)
        {
            return null;
        }
        else 
        {
            Rectangle max = boxes.get(0);
            for(Rectangle r : boxes)
            {
                if(max.getWidth() < r.getWidth())
                {
                    max = r;
                }
            }
            return max;
        }
    }
}