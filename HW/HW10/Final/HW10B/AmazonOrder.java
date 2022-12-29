import java.util.ArrayList;
/**
 * Models an amazon order with items and price.
 *
 * @DCruzin
 * @4.2.19
 */
public class AmazonOrder
{
    private ArrayList<Item> cart;

    /**
     * Constructor for objects of class AmazonOrder
     */
    public AmazonOrder()
    {
        cart = new ArrayList<Item>(0);
    }

    /**
     * Adds an item to the amazon order.
     *
     * @param  addition  the item to add to the order.
     */
    public void add(Item addition)
    {
        cart.add(addition);
    }
    
    /**
     * Computes the average price of the order.
     *
     * @return    The average price of the order
     */
    public double average()
    {
        double sum = 0;
        int count = cart.size();
        double average = 0;
        if (cart.size() > 0)
        {
            for(Item p : cart)
            {
                sum = sum + p.getPrice();
            }
            average = sum/count;
        }
        return average;
    }
    
    /**
     * Checks if two orders are the same, regardless of order.
     *
     * @param  otherOrder  the other order to reference.
     * @return    Whether the orders are the same.
     */
    public boolean sameContents(AmazonOrder otherOrder)
    {
        boolean match = true;
        if (cart.size() != otherOrder.cart.size())
        {
            match = false;
        }
        else
        {
            for(Item p : cart)
            {
                boolean otherContains = false;
                for(Item place : otherOrder.cart)
                {
                    if (place.getName().equals(p.getName()))
                    {
                        otherContains = true;
                    }
                }
                if (otherContains = false)
                {
                    match = false;
                }
            }
        }
        return match;
    }
    
    /**
     * Returns a string array list of the items being ordered.
     *
     * @return    the names of the items being ordered.
     */
    public ArrayList<String> order()
    {
        ArrayList<String> result = new ArrayList<String>(0);
        for (Item p : cart)
        {
            result.add(p.getName());
        }
        return result;
    }
    
    // /**
     // * Gets the size of the amazon order for use in other methods.
     // *
     // * @return    the size of the order.
     // */
    // private int getSize()
    // {
        // put your code here
        // return cart.size();
    // }
}
