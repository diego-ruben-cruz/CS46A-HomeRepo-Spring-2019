
public class IntArray2DProcessorTester
{
    public static void main(String[] args)
    {
        int[][] array = {
                {1,2,3,-5},
                {3,5,-1,2},
                {-2,7,5,3}
            };
        IntArray2DProcessor processor = new IntArray2DProcessor(array);

        int[][] array2 = {
                {-4,-2,-3,-5},
                {-3,-5,-1,-2},
                {-2,-7,-5,-3}
            };
        IntArray2DProcessor processor2 = new IntArray2DProcessor(array2);

        System.out.println(processor.sum());
        System.out.println(processor2.sum());

        System.out.println(processor.max());
        System.out.println("Expected: 7");
        System.out.println(processor2.max());
        System.out.println("Expected: -1");
        System.out.println(processor.sum(1));
        System.out.println("Expected: 9");
    }
}
