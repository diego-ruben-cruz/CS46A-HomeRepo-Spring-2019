import java.util.ArrayList;
/**
 * Contains useful operations for variables defined in other java files.
 *
 * @DCruzin
 * @4.18.19
 */
public class StaticUtility
{
    /**
     * Gives the maximum value given an array of doubles.
     *
     * @param  numbers  The array of doubles to work with
     * @return    The maximum value, given that the array has at least 1 element. Otherwise, it just gives -infinity.
     */
    public static double max(double[] numbers)
    {
        double max = 0;
        if(numbers.length > 0)
        {
            max = numbers[0];
            for(double p : numbers)
            {
                if (max < p)
                {
                    max = p;
                }
            }
        }
        else
        {
            max = Double.NEGATIVE_INFINITY;
        }
        return max;
    }
}
