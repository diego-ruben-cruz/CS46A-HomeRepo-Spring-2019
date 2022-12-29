
/**
 * A class to test Circle.
 * 
 * @author KOBrien 
 * @version 7/30/2016
 */
public class CircleTester
{
   public static void main(String[] args)
   {
      Circle myCircle = new Circle(10);
      double instanceArea = myCircle.area();
      System.out.printf("The area is: %.4f\n", instanceArea);
      
      double area = Circle.area(10);
      System.out.print("Actual: " + area);
      System.out.println();
      System.out.println("Expected: " + (100*Math.PI));
   }
}

