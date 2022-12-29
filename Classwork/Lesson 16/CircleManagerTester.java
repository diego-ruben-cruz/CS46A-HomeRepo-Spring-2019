
public class CircleManagerTester
{
    public static void main(String[] args)
    {
        CircleManager circles = new CircleManager();
        circles.add(new Circle(10.0));
        circles.add(new Circle(20.0));
        circles.add(new Circle(100.0));
        circles.add(new Circle(1.0));
        
        CircleManager emptyList = new CircleManager();
        
        CircleManager noneGreaterThan10 = new CircleManager();
        noneGreaterThan10.add(new Circle(1.0));
        noneGreaterThan10.add(new Circle(10.0)); 
        
        //sum
        System.out.printf("Sum: %.2f\n", circles.sumAreas());
        System.out.println("Expected: 32989.86");
        System.out.println("Sum when empty: " + emptyList.sumAreas());
        System.out.println("Expected: 0.0");
        System.out.println();
        
        //average        
        System.out.printf("Average: %.2f\n" , circles.averageArea());
        System.out.println("Expected: 8247.47");
        System.out.println("Average when empty: " + emptyList.averageArea());
        System.out.println("Expected: 0.0");
        System.out.println();
        
//         //largest
        System.out.println("largest: " +circles.largest());
        System.out.println("Expected: Circle[radius=100.0]");
        System.out.println("largest when empty: " +emptyList.largest());
        System.out.println("Expected: null");
        System.out.println();

       //first radius > 10
       System.out.println("Radius > 10: " 
              + circles.firstRadiusGreaterThan10());
       System.out.println("Expected: Circle[radius=20.0]");
       System.out.println("Radius > 10 when empty: " 
              + emptyList.firstRadiusGreaterThan10());
       System.out.println("Expected: null");
       System.out.println("Radius > 10 noneGreaterThan10: " 
               + noneGreaterThan10.firstRadiusGreaterThan10());        
       System.out.println("Expected: null");
       System.out.println();
       
       //Counting circles with radius > 1
       System.out.println("Radius > 1: " + circles.countRadiusGreaterThanOne());
       System.out.println("Expected: 3");
       System.out.println();
       
       //Array list of circles with radius > 10
       System.out.println("Radius > 10: " + circles.radius10OrGreater());
       System.out.println("Expected: [Circle[radius = 20.0], Circle[radius = 100.0]]");
       System.out.println();
    }
}
