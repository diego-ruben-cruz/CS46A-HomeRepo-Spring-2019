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
    
    /**
     * Gives the maximum value given an array of doubles.
     *
     * @param  numbers  The array list of doubles to work with
     * @return    The maximum value, given that the array has at least 1 element. Otherwise, it just gives -infinity.
     */
    public static double max(ArrayList<Double> numbers)
    {
        double max = 0;
        if(numbers.size() > 0)
        {
            max = numbers.get(0);
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
    
    /**
     * Checks if a list of strings contain a certain string twice.
     *
     * @param  list  the list to use as a reference.
     * 
     * @param   target  The string that is being checked.
     * 
     * @return    Whether the list contains two copies of that particular string.
     */
    public static boolean containsTwice(String[] list, String target)
    {
        boolean status = false;
        int count = 0;
        if (list.length > 0)
        {
            for(String p : list)
            {
                if (target.equals(p))
                {
                    count++;
                }
            }
            if(count == 2)
            {
                status = true;
            }
        }
        return status;
    }
    
    /**
     * Checks if a list of strings contain a certain string twice.
     *
     * @param  list  the list to use as a reference.
     * 
     * @param   target  The string that is being checked.
     * 
     * @return    Whether the list contains two copies of that particular string.
     */
    public static boolean containsTwice(ArrayList<String> list, String target)
    {
        boolean status = false;
        int count = 0;
        if (list.size() > 0)
        {
            for(String p : list)
            {
                if (target.equals(p))
                {
                    count++;
                }
            }
            if(count == 2)
            {
                status = true;
            }
        }
        return status;
    }
}
