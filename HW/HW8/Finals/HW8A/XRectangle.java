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
        for (int c = 1; c <= 4; c++)
        {
            for(int r = 1; r <= 5; r++)
            {
                X figure = new X(xStart, yStart, this.getRandomColor());
                figure.draw();
                xStart = xStart + WIDTH;
            }
            xStart = xStart - (WIDTH*5);
            yStart = yStart + HEIGHT;
        }
    }
    /**
     * Provides a random color from red, blue, black, and green.
     * 
     * */
    public Color getRandomColor()
    {
        Color randomColor = null;
        int num = gen.nextInt(NUMBER_OF_COLORS);
        if (num == RED)
        {
            randomColor = Color.RED;
        }
        else if(num == BLUE)
        {
            randomColor = Color.BLUE;
        }
        else if(num == BLACK)
        {
            randomColor = Color.BLACK;
        }
        else if(num == GREEN)
        {
            randomColor = Color.GREEN;
        }
        return randomColor;
    }
}