/**
 * Models a tree with a type and a height
 */
public class Tree implements Measurable
{
    private String type;
    private double height;
    /**
     * Constructs a new Tree
     * @param type the Tree's type
     * @param height the height of the Tree
     */
    public Tree(String type, double height)
    {
        this.type = type;
        this.height = height;
    }

    /**
     * Gets the Tree's type
     * @return the type of the Tree
     */
    public String getType()
    {
        return type;
    }

    /**
     * Gets the Tree's height
     * @return the height of the Tree
     */
    public double getHeight()
    {
        return height;
    }

    /**
     * Sets a new type for the Tree
     * @param newType the new type for the Tree
     */
    public void setType(String newType)
    {
        type = newType;
    }

    /**
     * Sets a new height for the Tree
     * @param height the new height for the Tree
     */
    public void setHeight(double height)
    {
        this.height = height;
    }   
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public double getMeasure()
    {
        return height;
    }
}