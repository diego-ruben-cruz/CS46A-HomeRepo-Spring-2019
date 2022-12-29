import java.util.ArrayList;
/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    // instance variables - replace the example below with your own
    private ArrayList<Product> inventory;

    /**
     * Constructor for objects of class ShoppingCart
     * 
     * @param   given   The products already inside the cart.
     * 
     */
    public ShoppingCart(ArrayList<Product> given)
    {
        inventory = given;
    }

    /**
     * Adds a product to the shopping cart.
     *
     * @param   addition    The product that will be added to the cart.
     */
    public void add(Product addition)
    {
        inventory.set(inventory.size(), addition);
    }
    
    /**
     * Gets the total price for what is in the shopping cart.
     *
     * @return    The total price.
     */
    public double getTotalPrice()
    {
        double sum = 0;
        for(Product p : inventory)
        {
            sum = sum + p.getPrice();
        }
        return sum;
    }
}
