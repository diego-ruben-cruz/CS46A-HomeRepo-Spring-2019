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
     * Constructor for objects of class RGBRectangle
     * 
     * @param   x1 The top left x coordinate.
     * 
     * @param   y1  The top left y coordinate.
     * 
     * @param   width   The width of thre rectangle.
     * 
     * @param   height  The height of the rectangle.
     * 
     * @param   theColor    The color to be assigned to the rectangle.
     */
    public RGBRectangle(int x1, int y1, int width, int height, String theColor)
    {
        super(x1,y1,width,height);
        rgbColor = theColor;
        this.setRGBColor(theColor);
    }

    /**
     * Gets the color of the rectangle
     *
     * 
     * @return    the color of the rectangle
     */
    public String getRGBColor()
    {
        if(rgbColor.equals("red"))
        {
            return rgbColor;
        }
        else if(rgbColor.equals("green"))
        {
            return rgbColor;
        }
        else if(rgbColor.equals("blue"))
        {
            return rgbColor;
        }
        else 
        {
            return "gray";
        }
    }

    /**
     * Sets the color of the rectangle to a specified color.
     *
     * @param   newColor    The new color to set the rectangle to.
     */
    public void setRGBColor(String newColor)
    {
        rgbColor = newColor;
        if(rgbColor.equals("red"))
        {
            super.setColor(Color.RED);
        }
        else if(rgbColor.equals("green"))
        {
            super.setColor(Color.GREEN);
        }
        else if(rgbColor.equals("blue"))
        {
            super.setColor(Color.BLUE);
        }
        else 
        {
            super.setColor(Color.GRAY);
        }
    }

    /**
     * A stub to prevent invalid color changes
     *
     * @param  aColor  a useless parameter
     */
    public void setColor(Color aColor)
    {

    }
}
