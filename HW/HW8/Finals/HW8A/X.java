public class X
{
    private int x;
    private int y;
    private Color color;
    public static final int HEIGHT = 20;
    public static final int WIDTH = 15;
    
    /**
     * Constructs an X at the given coordinates in the given color
     * @param x the coordinate of the upper left hand corner of this X
     * @param y the coordinate of the upper left hand corner of this Y
     * @param c the color of this X
     */
    public X(int x, int y, Color c)
    {
        this.x = x;
        this.y = y;
        color = c;
    }
    
    /**
     * Draws the X on the Canvas
     */
    public void draw()
    {
        Line line1 = new Line(x, y, x + WIDTH, y + HEIGHT);
        Line line2 = new Line(x + WIDTH, y, x , y + HEIGHT);
        line1.setColor(color);
        line2.setColor(color);
        line1.draw();
        line2.draw();
    }
}