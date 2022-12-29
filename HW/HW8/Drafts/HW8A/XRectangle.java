import java.util.Random;
public class XRectangle
{
    public static final int ROWS = 4;
    public static final int COLUMNS = 5;
    public static final int RED = 0;
    public static final int BLUE = 1;
    public static final int BLACK = 2;
    public static final int GREEN = 3;
    public static final int NUMBER_OF_COLORS = 4;
    public static final int HEIGHT = 20;
    public static final int WIDTH = 15;

    private int xStart;
    private int yStart;
    private Random gen;

    /**
     * Constructs a XRectangle at the given x, y
     * @param theX x coordinate of the upper-left hand corner of this Object
     * @param theY y the upper-left hand corner of this Object
     */
    public XRectangle(int theX, int theY)
    {
        gen = new Random(54319577);

        xStart = theX;
        yStart = theY;

    }

    /**
     * Draws this XRectangle
     */
    public void draw()
    {
        for(int r = 1; r <= 4; r++)
        {
            X figure = new X(xStart, yStart, Color.RED);
            figure.draw();
            yStart = yStart + HEIGHT;
        }
    }
}