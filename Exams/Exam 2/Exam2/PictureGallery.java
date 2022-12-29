import java.util.ArrayList;
/**
 * Write a description of class PictureGallery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PictureGallery
{
    // instance variables - replace the example below with your own
    private ArrayList<Picture> list;

    /**
     * Constructor for objects of class PictureGallery
     */
    public PictureGallery()
    {
        list = new ArrayList<Picture>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void add(Picture p)
    {
        list.add(p);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Picture mostNarrow()
    {
        Picture mostNarrow = null;
        if (list.size() > 0)
        {
            mostNarrow = list.get(0);
            for(Picture p : list)
            {
                if(mostNarrow.getMaxX() > p.getMaxX())
                {
                    mostNarrow = p;
                }
            }
        }
        return mostNarrow;
    }
}
