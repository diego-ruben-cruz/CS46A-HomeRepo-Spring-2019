import java.util.ArrayList;
/**
 * Write a description of class Company here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Company
{
    // instance variables - replace the example below with your own
    private ArrayList<Employee> list;

    /**
     * Constructor for objects of class Company
     */
    public Company()
    {
        list = new ArrayList<Employee>();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void add(Employee e) 
    {
        list.add(e);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String highestPaid()
    {
        if(list.size() > 0)
        {
            Employee max = list.get(0);
            for(Employee e : list)
            {
                if(max.getSalary() < e.getSalary())
                {
                    max = e;
                }
            }
            return max.getName();
        }
        else
        {
            return "";
        }
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int employeeCount()
    {
        return list.size();
    }
}
