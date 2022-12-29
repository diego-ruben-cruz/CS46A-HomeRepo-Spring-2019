/**
 * Models a child climbing a pole
 * 
 * @author Diego Cruz
 */
public class Climber
{
    private String name;
    private int position;
    public static final int POLE_TOP = 10;
    /**
     * Constructs a new climber with the given name and position. 
     * @param theName the name of this climber
     * @param thePosition the starting potition on the pole
     */
    public Climber (String theName, int thePosition)
    {
        this.setName(theName);
        position = thePosition;
        if (position < 0)
        {
            position = 0;
        }
        else if(position > 10)
        {
            position = POLE_TOP;
        }
    }

    /**
     * Gets the name of this Climber
     * @return the name of this Climber
     */
    public String getName()
    {
        if (name.equals("James"))
        {
            name = "Jimmy";
            return name;
        }
        else
        {
            return name;
        }
    }

    /**
     * Gets the position on the pole of this Climber
     * @return the position on the pole of this Climber
     */
    public int getPosition()
    {
        return position;
    }

    /**
     * Sets the new name for this Climber
     * @param newName the new name for this Climber
     */
    public void setName(String newName)
    {
        name = newName;
        if (name.equals("James"))
        {
            name = "Jimmy";
        }
    }

    /**
     * Climb one unit on the pole
     */
    public void climb()
    {
        position = position+1;
        if (position > 10)
        {
            position = POLE_TOP;
        }
    }

    /**
     * returns the Climber to the bottom of the pole.
     */
    public void slide()
    {
        position = 0;
    }

}