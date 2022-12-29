
/**
 * Product Class creates an object that has a name and price, which can be
 * changed as the user sees fit.
 *
 * @Diego Cruz
 * @2.12.19
 */
public class Product
{
    private String name;
    private double price;
    /**
     * Constructs a Product with a given name and a price.
     * @param theName the name of the Product
     * @param thePrice the price of the Product
     */
    public Product(String theName, double thePrice)
    {
        name = theName;
        price = thePrice;
    }
    /**
     * Gets the price of the product.
     * @return the price of the product
     */
    public double getPrice()
    {
        return price;
    }
    /**
     * Gets the name of the product.
     * @return the name of the product
     */
    public String getName()
    {
        return name;
    }
    /**
     * Reduces the price of the product by a given percentage.
     * @param percent percent used to reduce price
     */
    public void reducePrice(double percent)
    {
        double amountToReduce = price * percent/100;
        price = price - amountToReduce;
    }
    /**
     * Increases the price of the product by a given percentage.
     * @param percent percent used to increase price
     */
    public void increasePrice(double percent)
    {
        double amountToIncrease = price * percent/100;
        price = price + amountToIncrease;
    }
}
