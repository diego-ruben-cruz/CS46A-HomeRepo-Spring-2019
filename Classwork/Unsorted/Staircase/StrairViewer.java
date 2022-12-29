
/**
 * Write a description of class StrairViewer here.
 *
 * @ author Diego Cruz
 * @ 2.7.2019
 */
public class StrairViewer
{
    public static void main(String[] args)
    {
        Rectangle topStep = new Rectangle( 20, 10, 20, 20);
        topStep.setColor(Color.BLUE);
        topStep.fill();
        
        Ellipse circleStep1 = new Ellipse(20,10,20,20);
        circleStep1.setColor(Color.RED);
        circleStep1.fill();
        
        
        Rectangle middleStep = new Rectangle(20, 30, 40, 20);
        middleStep.setColor(Color.GREEN);
        middleStep.fill();
        
        Rectangle lastStep = new Rectangle(20, 50, 60, 20);
        Color myColor = new Color(255, 0, 255);
        lastStep.setColor(myColor);
        lastStep.fill();
        
        Line diagLine = new Line(20,10,80,70);
        diagLine.draw();
        
        
    }
}
