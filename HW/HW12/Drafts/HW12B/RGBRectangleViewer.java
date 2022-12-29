/**
 * Tests the RGBRectangle class.
 */
public class RGBRectangleViewer
{
    public static void main(String[] args)
    {
        //Construct with default color
        RGBRectangle r = new RGBRectangle(10, 20, 20, 40);
        r.fill();      
        
        Text message = new Text(10, 70, r.getRGBColor());
        message.draw();
        
        r.setRGBColor("cyan"); //should compile buy have no effect
        message = new Text(10, 90, r.getRGBColor());
        message.draw();

    }
  
}