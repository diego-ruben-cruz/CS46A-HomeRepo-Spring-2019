
/**
 * Write a description of class Manager here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Manager extends Employee
{
    private double bonus;
    /**
     * Constructor for objects of class Manager
     */
    public Manager(String theName, double theSalary, double theBonus)
    {
        super(theName,theSalary);
        bonus = theBonus;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getBonus()
    {
        return bonus;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void setBonus(double newBonus)
    {
        bonus = newBonus;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double totalCompensation()
    {
        return super.getSalary() + bonus;
    }
    
    /**
     * Gets information about this Manager
     * @return information about this Manager
     */
    public String getInfo()
    {
        String s = "name: " + super.getName() + " baseSalary: " + super.getSalary() + " bonus: " + bonus;
        return s;
    }  
}
