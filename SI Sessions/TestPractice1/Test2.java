
/**
 * Write a description of class PictureBuilder here.
 *
 * @author DCruzin
 * @version 2.28.19
 */
public class Test2
{
    public static void main(String[] args)
    {
        double x = 0;
        double y = 0;
        Ellipse biggie = new Ellipse(x, y, 100, 100);
        biggie.draw();
        Ellipse top = new Ellipse(x+25, y, 50, 50);
        top.draw();
        Ellipse bottom = new Ellipse(x+25,y+50,50,50);
        bottom.draw();
        Ellipse right = new Ellipse(x+50,y+25,50,50);
        right.draw();
        Ellipse left = new Ellipse(x,y+25,50,50);
        left.draw();
    }
}
