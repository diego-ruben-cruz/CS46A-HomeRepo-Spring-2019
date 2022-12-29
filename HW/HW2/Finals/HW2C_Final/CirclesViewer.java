/**
 * Draws some circles and a line
 * Diego Cruz
 */
import javax.swing.JFrame;
public class CirclesViewer
{
    public static void main(String[] args)
    {
        Ellipse redCircle = new Ellipse(50,10,40,40);
        redCircle.fill();
        redCircle.setColor(Color.RED);
        Ellipse yelCircle = new Ellipse(90,10,40,40);
        yelCircle.fill();
        yelCircle.setColor(Color.YELLOW);
        Ellipse bluCircle = new Ellipse(130,10,40,40);
        bluCircle.fill();
        bluCircle.setColor(Color.BLUE);
        Line centerLine = new Line(70,30,150,30);
        centerLine.draw();
    }
}