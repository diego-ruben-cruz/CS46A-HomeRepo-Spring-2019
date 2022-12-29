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
       System.out.printf("Volume: %.2f%n" , balloon.volume());
       System.out.println("Expected:  4188.79"); 
       System.out.printf("Cost of goods: %.2f%n", balloon.costOfGoods());
       System.out.println("Expected:  7.40"); 
       System.out.printf("Retail price: %.2f%n", balloon.retailPrice());
       System.out.println("Expected:  9.40"); 
       
       balloon = new HeliumBalloon(-10.0);
       System.out.printf("Volume: %.2f%n" , balloon.volume());
       System.out.println("Expected:  0.00");
       
       
       balloon.setRadius(20);
       System.out.printf("Volume: %.2f%n" , balloon.volume());
       System.out.println("Expected:  33510.32"); 

      
    }
}