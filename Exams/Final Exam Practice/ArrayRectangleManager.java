public class ArrayRectangleManager
{
    private Rectangle[] boxes;
    
    public ArrayRectangleManager(Rectangle[] array)
    {
        boxes = array;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Rectangle maxWidth()
    {
        if (boxes.length == 0)
        {
            return null;
        }
        else 
        {
            Rectangle max = boxes[0];
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