
/**
 * Creates a student object that provides both a name and a score..
 *
 * @author DCruzin
 * @version 2.14.19
 */
public class Student
{
    // instance variables - replace the example below with your own
    private String name;
    private double score;

    /**
     * Constructor for objects of class Student
     */
    public Student(String theName)
    {
        name = theName;
    }

    /**
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public String getName()
    {
        return name;
    }
    /**
     * Outputs the current score of the student.
     *
     * @return  The current score of the student.
     */
    public double getTotalScore()
    {
        return score;
    }
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  newName  New name to be used. 
     * @return    null
     */
    public void setName(String newName)
    {
        name = newName;
    }
    /**
     * Adds points to the student's total score.
     *
     * @param  toAdd  points to be added.
     * @return    the new score
     */
    public double addScore(double toAdd)
    {
        score = score + toAdd;
        return score;
    }
    
    
    
}
