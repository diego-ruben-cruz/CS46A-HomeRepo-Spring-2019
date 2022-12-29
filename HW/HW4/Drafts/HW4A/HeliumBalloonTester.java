/**
 * Tester for HeliumBalloon class
 * 
 * @author Kathleen O'Brien
 */
public class HeliumBalloonTester
{
   public static void main(String[] args)
   {
       HeliumBalloon balloon = new HeliumBalloon(10.0);
       System.out.println("Radius: " + balloon.getRadius());
       System.out.println("Expected:  10.0"); 
       
       balloon.setRadius(100);
       System.out.println("Radius: " + balloon.getRadius());
       System.out.println("Expected:  100.0");
       
       balloon.setRadius(20.0);
       System.out.println("Radius: " + balloon.getRadius());
       System.out.println("Expected:  20.0");
       
       System.out.println(HeliumBalloon.CUBIC_INCHES_PER_CUBIC_FOOT
          + " " + HeliumBalloon.VOLUME_OF_TANK_IN_CUBIC_FEET);
       System.out.println("Expected:  1728 300");
       
       System.out.println(HeliumBalloon.PRICE_OF_BALLOON
          + " " + HeliumBalloon.PRICE_OF_TANK + " " + HeliumBalloon.PROFIT);
       System.out.println("Expected:  5.5 235.0 2.0");
    }
}