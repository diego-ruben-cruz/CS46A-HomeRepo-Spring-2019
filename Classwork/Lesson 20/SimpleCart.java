
/**
 * Write a description of class SimpleCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SimpleCart
{
    // instance variables - replace the example below with your own
    private double total;

    /**
     * Constructor for objects of class SimpleCart
     */
    public SimpleCart()
    {
        total = 0;
    }

    /**
     * Adds a price to the total of the cart.
     *
     * @param  price  The price to add to the total of the cart.
     */
    public void add(double price)
    {
        total = total + price;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @return    the current total price of the cart.
     */
    public double getTotal()
    {
        return total;
    }
    
    /**
     * Sets the total to a specified price.
     *
     * @param  newTotal  The new total to reference.
     */
    public void setTotal(double newTotal)
    {
        total = newTotal;
    }
}
