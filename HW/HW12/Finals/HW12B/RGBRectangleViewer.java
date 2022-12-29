/**
 * Tests the RGBRectangle class.
 */
public class RGBRectangleViewer
{
    public static void  main(String[] args)
    {
        //Construct with default color
        RGBRectangle r = new RGBRectangle(10, 20, 20, 40);
        r.fill();             
        Text message = new Text(10, 70, r.getRGBColor());
        message.draw();
               
        // red
        r = new RGBRectangle(60, 20, 20, 40, "red");
        r.fill();
        message = new Text(60, 70, r.getRGBColor());
        message.draw();
        
        //set a bad color 
        r = new RGBRectangle(110, 20, 20, 40, "red");
        r.setRGBColor("purple"); //color should be red
        r.fill();
        message = new Text(110, 70, r.getRGBColor());
        message.draw();
        
        //construct with bad color
        r = new RGBRectangle(160, 20, 20, 40, "orange");
        r.fill(); //should be gray
        message = new Text(160, 70, r.getRGBColor());
        message.draw();
        
        //blue
        r = new RGBRectangle(210, 20, 20, 40, "blue");
        r.fill();
        message = new Text(210, 70, r.getRGBColor());
        message.draw();
        
        //green
        r = new RGBRectangle(260, 20, 20, 40, "green");
        r.fill();
        message = new Text(260, 70, r.getRGBColor());
        message.draw();
        
        //try to set a color in the superclass
        r = new RGBRectangle(310, 20, 20, 40, "green");
        r.setColor(Color.BLUE); //should be green not blue
        r.fill();
        message = new Text(310, 70, r.getRGBColor());
        message.draw();
        

    }
  
}