/**
 * Test the Cylinder class
 */
public class CylinderTester
{
    public static void main(String[] args)
    {
        Cylinder tube = new Cylinder(10.0, 1.0);
        System.out.printf("Volume: %.2f%n", tube.getVolume());
        System.out.println("Expected: 31.42");
      
        tube.setHeight(20.0);
        System.out.printf("Volume: %.2f%n", tube.getVolume());
        System.out.println("Expected: 62.82");
        
    }
}
