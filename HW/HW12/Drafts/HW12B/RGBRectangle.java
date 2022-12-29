
/**
 * Models a rectangle with limited color choices.
 *
 * @DCruzin
 * @
 * 
 */
public class RGBRectangle extends Rectangle
{
    // instance variables - replace the example below with your own
    private String rgbColor;

    /**
     * Constructor for objects of class RGBRectangle
     * 
     * @param   x1 The top left x coordinate.
     * 
     * @param   y1  The top left y coordinate.
     * 
     * @param   width   The width of thre rectangle.
     * 
     * @param   height  The height of the rectangle.
     */
    public RGBRectangle(int x1, int y1, int width, int height)
    {
        super(x1,y1,width,height);
        rgbColor = "gray";
        super.setColor(Color.GRAY);
    }

    /**
     * Gets the color of the rectangle
     *
     * 
     * @return    the color of the rectangle
     */
    public String getRGBColor()
    {
        // put your code here
        return rgbColor;
    }

    /**
     * Sets the color of the rectangle to a specified color.
     *
     * @param   newColor    The new color to set the rectangle to.
     */
    public void setRGBColor(String newColor)
    {

    }
}
