import java.util.Arrays;
public class IntArrayTester
{
    public static void main(String[] args)
    {
        int[] list = {5, 3, 7, 1, 4, 7, 6};  
        IntArray util = new IntArray(list);
        
        int[] list2 = {-7, -2, -9, -4, -7, -6, -1, -5, -7};  
        IntArray util2 = new IntArray(list2);
        
        int[] list3 = new int[0];  
        IntArray util3 = new IntArray(list3);
        
        System.out.println("Sum: " + util.sum()); 
        System.out.println("Expected: 33");
        System.out.println("Sum: " + util2.sum());
        System.out.println("Expected: -48");
        System.out.println("Sum: " + util3.sum()); 
        System.out.println("Expected: 0");
                
    }
}