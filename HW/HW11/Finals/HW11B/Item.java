/**
 * Models an item that has both a name and a price.
 *
 * @DCruzin
 * @4.18.19
 */
public class Item implements Comparable
{
    // instance variables - replace the example below with your own
    private String name;
    private double price;
    /**
     * Constructor for objects of class Name
     * 
     * @param   theName The given name.
     * @param   thePrice    The given price.
     */
    public Item(String theName, double thePrice)
    {
        name = theName;
        price = thePrice;
    }
    
    /**
     * Gets the name of the current item.
     *
     * @return    The name of the item.
     */
    public String getName()
    {
        // put your code here
        return name;
    }
    
    /**
     * Gets the price of the current item.
     *
     * @return    The price of the item.
     */
    public double getPrice()
    {
        // put your code here
        return price;
    }
    
    /**
     * Sets the name of the current item to a given string.
     *
     * @param  newName  The new name to use.
     */
    public void setName(String newName)
    {
        name = newName;
    }
    
    /**
     * Sets the price of the current item to a desired quantity.
     *
     * @param  newPrice  The new price to use.
     */
    public void setPrice(double newPrice)
    {
        price = newPrice;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int compareTo(Object otherObject)
    {
        Item other = (Item) otherObject;
        if(this.getPrice() < other.getPrice())
        {
            return -1;
        }
        else if(this.getPrice() > other.getPrice())
        {
            return 1;
        }
        else
        {
            return this.getName().compareTo(other.getName());
        }
    }
}