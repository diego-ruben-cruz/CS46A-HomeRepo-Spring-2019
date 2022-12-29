/**
 * Work with arrays
 */
public class IntArrayProcessor
{
    private int[] integers;

    /**
     * Constructs an IntArrayProcessor with the given array
     * @param array the array to use in this IntArrayProcessor
     */
    public IntArrayProcessor(int[] array)
    {
        integers = array;
    }

    /**
     * Gets the maximum value in the array 
     * @return the maximum value in the array
     */
    public int getMax()
    {
        int max = integers[0];
        for (int p : integers)
        {
            if (max < p)
            {
                max = p;
            }
        }
        return max;
    }

    /**
     * Gets a comma separated string of the elements in 
     * the array. The integers are listed separated with a ", " (That is 
     * a comma followed by a space)
     * 
     * @return a String representing the sum or the elements 
     * as a comma separated list
     */
    public String commaSeparatedList()
    {
        String result = "";
        for (int p = 0 ; p < integers.length - 1; p++)
        {
            String convert = integers[p] + "";
            result = result + convert + ", ";
        }
        result = result + integers[integers.length - 1];
        return result;
    }

    /**
     * Gets the number of even integers in the array
     * @return the number of even integers in the array
     */
    public int evenCount()
    {
        int count = 0;
        for (int p : integers)
        {
            if (p%2 == 0)
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Swaps two indexes in the array.
     * 
     */
    public void swap(int index1, int index2)
    {
        if(index1 >= 0 && index2 >= 0 && index1 < integers.length && index2 < integers.length)
        {
            int temp = integers[index1];
            integers[index1] = integers[index2];
            integers[index2] = temp;
        }
    }

}
