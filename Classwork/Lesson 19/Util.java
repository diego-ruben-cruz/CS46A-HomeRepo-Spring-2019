import java.util.ArrayList;
/**
 * Write a description of class Util here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Util
{
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static int sum(int[] input)
    {
        int sum = 0;
        for(int p : input)
        {
            sum = sum + p;
        }
        return sum;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static String longest(ArrayList<String> input)
    {
        String longest = "";
        if (input.size() > 0)
        {
            longest = input.get(0);
            for (String p : input)
            {
                if (longest.length() < p.length())
                {
                    longest = p;
                }
            }
        }
        else
        {
            longest = "";
        }
        return longest;
    }
}
