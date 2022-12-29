
/**
 * Tests the OilPackage class.
 * 
 *
 */
public class OilPackageTester
{
    public static void main(String[] args)
    {
        OilPackage item = new OilPackage(1.0, 3.0);
        System.out.println("Volume: " + item.getVolume());
        System.out.println("Expected: 9.42477796076938");
        System.out.println("$" + item.getCost());
        System.out.println("Expected: 3.5456570360911317");
        
        item.setRadius(10.0);
        System.out.println("Volume: " + item.getVolume());
        System.out.println("Expected: 942.4777960769379");
        System.out.println("$" + item.getCost());
        System.out.println("Expected: 8.065703609113182");
    }
}
