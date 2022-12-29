
/**
 * Write a description of class LinesLinesLines here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinesLinesLines
{
    public static void main (String[] args)
    {
        int x = 5;
        for(int r = 0; r < 10; r++)
        {
            Line greenLine = new Line(x,10,x,210);
            greenLine.setColor(Color.GREEN);
            greenLine.draw();
            x = x + 25;
        }
    }
}
