/**
 * Class to practice finding errors
 * @author KOBrien 
 * version with errors
 */
import java.awt.Rectangle;
public class RectangleTester
{
    public static void main(String[] args)
    {
        int y = 20;
        System.out.println(y);
        System.out.println("Expected: 20");
        Rectangle box = new Rectangle(10, y, 40, 60);
        System.out.println(box.getWidth());
        System.out.println("Expected: 40");
        System.out.println(box.getHeight());
        System.out.println("Expected: 60");
    }
}