
/**
 * Write a description of class WeatherChart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WeatherChart
{
    private double[][] grid;
    public final static double ABSOLUTE_ZERO = -273.15;
    /**
     * Constructor for objects of class WeatherChart
     */
    public WeatherChart(double[][] given)
    {
        grid = given;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double locationLow(int rowIndex)
    {
        if(rowIndex >= 0 && rowIndex < grid.length)
        {
            double min = grid[rowIndex][0];
            for(int c = 0; c < grid[rowIndex].length; c++)
            {
                if(min > grid[rowIndex][c])
                {
                    min = grid[rowIndex][c];
                }
            }
            return min;
        }
        else 
        {
            return ABSOLUTE_ZERO;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int mildCount()
    {
        int mildCount = 0;
        for(int r = 0; r < grid.length; r++)
        {
            for(int c = 0; c < grid[0].length; c++)
            {
                if (grid[r][c] >= 19 && grid[r][c] <= 28)
                {
                    mildCount++;
                }
            }
        }
        return mildCount;
    }
}
