/**
 * Tester for the WaterFlask class
 *
 */
public class WaterFlaskTester
{
    public static void main(String[] args)
    {
        WaterFlask flask = new WaterFlask(600);
        System.out.println(flask.getAmount());
        System.out.println("Expected: 600");

        flask.drink(100);
        System.out.println(flask.getAmount());
        System.out.println("Expected: 500.0");

        flask.drink(400);
        System.out.println(flask.getAmount());
        System.out.println("Expected: 100");

        flask.drink(200);
        System.out.println(flask.getAmount());
        System.out.println("Expected: -100"); //notice the amount is negative

        flask.fill();
        System.out.println(flask.getAmount());
        System.out.println("Expected: 600");

    }
}