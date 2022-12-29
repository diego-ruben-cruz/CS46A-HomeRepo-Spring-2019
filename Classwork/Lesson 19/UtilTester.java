import java.util.ArrayList;
public class UtilTester
{
    public static void main(String[] args)
    {
        int[] numbers = {2, 7, 4, 9, 11};
        
        ArrayList<String> strings =new ArrayList<>();
        strings.add("int");
        strings.add("final");
        strings.add("static");
        strings.add("interface");
        strings.add("final");
        
        
        System.out.println("Actual: " + Util.longest(strings));
        System.out.println("Expected: interface");
        System.out.println();
        System.out.println("Actual: " + Util.sum(numbers));
        System.out.println("Expected: 33");
    }
}

