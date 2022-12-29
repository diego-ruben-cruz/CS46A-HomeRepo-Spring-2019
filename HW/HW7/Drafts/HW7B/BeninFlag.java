public class BeninFlag
{
    private Picture pic;
    private int width;
    private int height;

    public Color getColorAt(int x, int y)
    {
        // TODO: add correct conditions to determine which color needs to be used at any (x, y) coordinate
        // TODO: set the variable c to that color
        Color c;
        if (y <= (height/2) - 1 && x >= height/2)
        {
            c = Color.YELLOW;
        }
        else
        {
            c = Color.WHITE;
        }
        return c;
    }

    public BeninFlag(int width, int height)
    {
        this.width = width;
        this.height = height;
        pic = new Picture(width, height);
        pic.draw();
        for (int x = 0; x < width; x++)
        {
            for (int y = 0; y < height; y++)
            {
                Color c = getColorAt(x, y);
                pic.setColorAt(x, y, c);
            }
        }
    }
}