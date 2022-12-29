
/**
 * Tests the Robot class.
 *
 * @author DCruzin
 * @version 2.15.19
 */
public class MoveTester
{
    public static void main (String[] args)
    {
        Robot robot = new Robot(0,0);
        robot.stepHoriz(5);
        robot.stepHoriz(-3);
        System.out.println(robot.getX());
        System.out.println("Expected: 2");
        robot.stepVert(6);
        robot.stepVert(-4);
        System.out.println(robot.getX());
        System.out.println("Expected: 2");
        robot.moveRight();
        System.out.println(robot.getX());
        System.out.println("Expected: 3");
    }
}
