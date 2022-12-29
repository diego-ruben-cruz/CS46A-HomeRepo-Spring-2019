/**
 * Describes a Student with a name and grade point.
 * 
 */
public class Student implements Qualifiable, Measurable
{
    private String name;
    private double gpa;
    public static final double QUALIFYING_GPA = 3.54;

    
    /**
     * Creates a student
     * @param theName the name of this student
     * @param theGpa the gpa of this student
     */
    public Student(String theName, double theGpa)
    {
        name = theName;
        gpa = theGpa;
    }
    
    /**
     * Gets the name of this student
     * @return the name of this student
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the GPA of this student
     * @return the GPA of this student
     */
    public double getGPA()
    {
        return gpa;
    }
    
    /**
     * Checks whether the student qualifies for the Dean's Honor List.
     *
     * @return    Whether the student qualifies for the Dean's Honor List.
     */
    public boolean qualifies()
    {
        if(gpa >= QUALIFYING_GPA)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public double getMeasure()
    {
        return gpa;
    }
}
