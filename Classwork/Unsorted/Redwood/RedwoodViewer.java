
/**
 * Draws a taller, thinner image of a redwood
 * 
 * @author Diego Cruz 
 */
public class RedwoodViewer
{
    public static void main(String[] args)
    {
        Picture redwood = new Picture("redwood.png");
        redwood.grow(25,50);
        redwood.translate(30,50);
        redwood.draw();
    }
}
