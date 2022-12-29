import java.util.Random;
public class ReliefMapTester
{
    public static void main(String[] args)
    {
        Random gen = new Random(98765);

        //create array with some negative negative
        int[][] array = new int[4][5];
        for (int row = 0; row < array.length; row++)
        {
            for(int col = 0; col < array[0].length; col++)
            {
                array[row][col] = (gen.nextInt(40) - 20) * 100; 
            }
        }
        ReliefMap map = new ReliefMap(array);
        System.out.println("Lowest: " + map.lowest());
        System.out.println("Expected: -1900");

        //change the array a bit
        array[3][4] = -2500;
        System.out.println("Lowest: " + map.lowest());
        System.out.println("Expected: -2500");

        //new array with all positive numbers
        int[][] array2 = new int[3][8];
        for (int row = 0; row < array2.length; row++)
        {
            for(int col = 0; col < array2[0].length; col++)
            {
                array2[row][col] = (gen.nextInt(30) +1)* 100; 

            }
        }

        ReliefMap map2 = new ReliefMap(array2);
        System.out.println("Lowest: "  + map2.lowest());
        System.out.println("Expected: 100");
        
        System.out.println("last: "  + map.lastEntry());
        System.out.println("Expected: -2500");
        
        System.out.println("last: "  + map2.lastEntry());
        System.out.println("Expected: 300");

        listPrint(array);
        listPrint(array2);    
    }
    
    //prints the array for your convenience 
    public static void listPrint(int[][] matrix)
    {
        System.out.println();
        for (int row = 0; row < matrix.length; row++)
        {
            for(int col = 0; col < matrix[0].length; col++)
            {
                System.out.print(matrix[row][col] + " " );
            }
            System.out.println();
        }        
    }
}