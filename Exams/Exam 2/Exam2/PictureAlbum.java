
/**
 * Write a description of class PictureAlbum here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PictureAlbum
{
    // instance variables - replace the example below with your own
    private Picture[] list;

    /**
     * Constructor for objects of class PictureAlbum
     */
    public PictureAlbum(Picture[] given)
    {
        list = given;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int landscapeCount()
    {
        int count = 0;
        for(Picture p : list)
        {
            if(p.getMaxX() > p.getMaxY())
            {
                count++;
            }
        }
        return count;
    }
}
