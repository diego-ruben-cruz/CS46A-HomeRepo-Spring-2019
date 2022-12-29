/**
 * Display a Monet painting
 * @author Diego Cruz
 */
public class Painting
{
    public static void main(String[] args)
    {
        Picture painting = new Picture("monet.jpg");
        painting.draw();
        painting.translate(200,150);
        int paintingWidth = 128;
        int paintingLength = 104;
        double reSizeWidth = paintingWidth*0.5;
        double reSizeLength = paintingLength*0.5;
        painting.grow(reSizeWidth,reSizeLength);
    }
}