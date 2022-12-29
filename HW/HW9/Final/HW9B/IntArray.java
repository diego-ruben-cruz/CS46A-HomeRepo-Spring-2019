
/**
 * Write a description of class IntArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IntArray
{
    // instance variables - replace the example below with your own
    private int[] array;

    /**
     * Constructor for objects of class IntArray
     * 
     * @param   given   The given int array to work with.
     * 
     */
    public IntArray(int[] given)
    {
        array = given;
    }

    /**
     * Computes the sum of the int array.
     *
     *@return   The computed sum.
     *
     */
    public int sum()
    {
        int sum = 0;
        for(int p : array)
        {
            sum = sum + p;
        }
        return sum;
    }

    /**
     * Displays the sum as a basic arithmetic sequence
     *
     *@return   The computed sum in string form.
     *
     */
    public String displaySum()
    {
        if (array.length != 0)
        {
            String result = "";
            for(int p = 0; p < array.length - 1; p++)
            {
                result = result + array[p] + "+";
            }
            result = result + array[array.length - 1] + "=";
            result = result + this.sum();
            return result;
        }
        else
        {
            return "=0";
        }
    }
}