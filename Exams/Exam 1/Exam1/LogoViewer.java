/**
 * Draws some Logo object in different locations
 * @author KOBrien
 */
public class LogoViewer
{
    public static void main(String[] args)
    {
        Logo logo1 = new Logo (90, 10);
        logo1.draw();
        
        Logo logo2 = new Logo (10, 80);
        logo2.draw();
        
        Logo logo3 = new Logo (150, 150);
        logo3.draw();
    }
}