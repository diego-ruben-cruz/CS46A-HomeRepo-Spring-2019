import java.util.ArrayList;
/**
 * Tester for the static methods of StaticUtility
 * 
 * @author Kathleen O'Brien
 */
public class StaticUtilityTester
{
    public static void main(String[] args)
    {
        //array max
        double[] numbers = {5.0, 6.6, 9.1, 8.4, 6.6,  7.4, 6.55};
        System.out.println("max array: "+ StaticUtility.max(numbers));
        System.out.println("Expected: 9.1");
        double[] numbers2 = {-5.0, -9.3, -8.1, -6.6, -7.4, -10.2, -5.7, -13.3};
        System.out.println("max array: "+ StaticUtility.max(numbers2));
        System.out.println("Expected: -5.0");
        double[] numbers3 = {};
        System.out.println("max array: "+ StaticUtility.max(numbers3));
        System.out.println("Expected: -Infinity");
    }
}