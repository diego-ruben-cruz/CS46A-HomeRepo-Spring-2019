import java.util.Arrays;
public class IntArrayProcessorTester
{
    public static void main(String[] args)
    {
        int[] list = {5, 3, 7, 1, 4, 7, 6};  
        IntArrayProcessor util = new IntArrayProcessor(list);
        
        int[] list2 = {-7, -2, -9, -4, -7, -6, -1, -5, -7};  
        IntArrayProcessor util2 = new IntArrayProcessor(list2);
        
        System.out.println("Max: " + util.getMax()); 
        System.out.println("Max: " + util2.getMax());
        System.out.println("Even Count: " + util.evenCount());
        System.out.println("Even Count: " + util2.evenCount());
        System.out.println("List: " + util.commaSeparatedList());

        // no comma at the end in these next two
        System.out.println("Expected: 5, 3, 7, 1, 4, 7, 6"); 
        System.out.println("List: " + util2.commaSeparatedList());
        System.out.println("Expected: -7, -2, -9, -4, -7, -6, -1, -5, -7");

        util.swap(7, 0);
        util.swap(-1, 3);
        util.swap(1, 4);
        System.out.println("Array: " + Arrays.toString(list));     
    }
}
