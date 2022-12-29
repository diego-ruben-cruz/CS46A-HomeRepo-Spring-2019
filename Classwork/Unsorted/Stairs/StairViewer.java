/**
 * Creating Stairs
 * @author Diego Cruz
 */
public class StairViewer
{
    public static void main(String[] args)
    {
        int rectWidth = 20;
        int rectHeight = 20;
        Rectangle step1 = new Rectangle(20,10,rectWidth,rectHeight);
        Rectangle step2 = new Rectangle(20,30,rectWidth*2,rectHeight);
        Rectangle step3 = new Rectangle(20,50,rectWidth*3,rectHeight);
        step1.draw();
        step2.draw();
        step3.draw();
        //do not change this line
        System.out.println();
    }
}