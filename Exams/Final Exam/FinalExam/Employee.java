import java.util.Random;
/**
 * Models an Employee
 */
public class Employee implements Comparable
{
    private String name;
    private double baseSalary;
    private Random random;

    /**
     * Constructs an Employee with a name and salary
     * @param theName the Employee name
     * @param theSalary the Employee salary
     */
    public Employee(String theName, double theSalary)
    {
        name = theName;
        baseSalary = theSalary;
        random = new Random(87654321);
    }

    /**
     * Sets a new name for this Employee
     * @param newName the new name
     */
    public void setName(String newName) 
    {
        name = newName;
    }

    /**
     * Sets a new salary for this Employee
     * @param newSalary the new salary
     */
    public void setBaseSalary(double newSalary)
    {
        baseSalary = newSalary;
    }

    /**
     * Gets the name of this Employee
     * @return the name of this Employee
     */
    public String getName() 
    { 
        return name; 
    }

    /**
     * Gets the salary of this Employee
     * @return the salary of this Employee
     */
    public double getSalary() 
    { 
        return baseSalary; 
    }
   
 
    /**
     * Gets information about this Employee
     * @return information about this Employee
     */
    public String getInfo()
    {
        String s = "name: " + name + " baseSalary: " + baseSalary;
        return s;
    }  
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int numberOfCharactersInName() 
    {
        return (name.length());
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int vowelCount()
    {
        int vowelcount = 0;
        String vowels = "aeiouAEIOU";
        for(int i = 0; i < name.length(); i++)
        {
            if (vowels.contains(name.substring(i,i+1)))
            {
                vowelcount++;
            }
        }
        return vowelcount;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getLetter()
    {
        int rando = random.nextInt(name.length());
        return name.substring(rando, rando + 1);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int compareTo(Object otherObject)
    {
        Employee e = (Employee) otherObject;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if(this.getSalary() < e.getSalary())
        {
            return -1;
        }
        else if (this.getSalary() == e.getSalary())
        {
            String currentInit = this.getName().substring(0,1);
            String otherInit = e.getName().substring(0,1);
            if(alphabet.indexOf(currentInit) < alphabet.indexOf(otherInit))
            {
                return -1;
            }
            else
            {
                return 1;
            }
        }
        else
        {
            return 1;
        }
    }
}
