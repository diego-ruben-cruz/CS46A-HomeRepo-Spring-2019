import java.util.ArrayList;
/**
 * Manages Ellipses.
 *
 * @DCruzin
 * @4.19.19
 */
public class EllipseManager
{
    private ArrayList<Ellipse> list;

    /**
     * Constructor for objects of class EllipseManager
     * 
     * @param   given   the given array list.
     */
    public EllipseManager(ArrayList<Ellipse> given)
    {
        list = given;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the sum of x and y
     */
    public Ellipse widest()
    {
        Ellipse result = null;
        if (list.size() > 0)
        {
            result = list.get(0);
            for(Ellipse p : list)
            {
                if (result.getWidth() < p.getWidth())
                {
                    result = p;
                }
            }
        }
        return result;
    }
}
