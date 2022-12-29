
/**
 * Write a description of class ReliefMap here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReliefMap
{
    // instance variables - replace the example below with your own
    private int[][] map;

    /**
     * Constructor for objects of class ReliefMap
     */
    public ReliefMap(int[][] array)
    {
        // initialise instance variables
        map = array;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int lowest()
    {
        int result = map[0][0];
        for (int row = 0; row < map.length; row++)
        {
            for(int column = 0; column < map[0].length; column++)
            {
                if (result > map[row][column])
                {
                    result = map[row][column];
                }
            }
        }
        return result;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int lastEntry()
    {
        int result = map[map.length - 1][map[0].length - 1];
        return result;
    }
}
