/**
 * Draws some the Circles object in different locations
 * @author KOBrien
 */
public class CirclesViewer
{
    public static void main(String[] args)
    {
        Circles c1 = new Circles (50, 10);
        c1.draw();
        
        Circles c2 = new Circles (10, 80);
        c2.draw();
        
        Circles c3 = new Circles (150, 150);
        c3.draw();
    }
}