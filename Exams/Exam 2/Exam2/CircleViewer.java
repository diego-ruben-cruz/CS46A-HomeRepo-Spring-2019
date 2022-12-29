import java.util.Random;
/**
 * Write a description of class CircleViewer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CircleViewer
{
    public static void main (String[] args)
    {
        final int MAX_X = 250;
        final int MAX_Y = 300;
        final int MIN_X = 0;
        final int MIN_Y = 100;
        final int NUMBER_OF_CIRCLES = 15;
        final int DIAMETER = 30;
        Random gen = new Random(14682489);
        
        for(int p = 0; p < NUMBER_OF_CIRCLES; p++)
        {
            Ellipse circle = new Ellipse(gen.nextInt(MAX_X), gen.nextInt(200) + 100, DIAMETER, DIAMETER);
            circle.setColor(Color.RED);
            circle.fill();
        }
    }
}
