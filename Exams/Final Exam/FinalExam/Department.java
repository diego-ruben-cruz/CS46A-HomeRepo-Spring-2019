import java.util.ArrayList;
/**
 * Write a description of class Department here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Department
{
    private Employee[] array;

    /**
     * Constructor for objects of class Department
     */
    public Department(Employee[] given)
    {
        array = given;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getAverageSalary()
    {
        if(array.length > 0)
        {
            double sum = 0;
            int num = array.length;
            for(Employee e : array)
            {
                sum = sum + e.getSalary();
            }
            double average = sum/num;
            return average;
        }
        else
        {
            return 0;
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public ArrayList<String> nameList()
    {
        ArrayList<String> list = new ArrayList<String>();
        String criteria = "ABC";
        if(array.length > 0)
        {
            for(Employee e : array)
            {
                String firstInit = e.getName().substring(0,1);
                if(criteria.contains(firstInit))
                {
                    list.add(e.getName());
                }
            }
            return list;
        }
        else
        {
            return list;
        }
    }
}
