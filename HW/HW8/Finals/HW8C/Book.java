/**
 * Models a book
 */
public class Book
{
    private String title;
    private double price;

    /**
     * Constructs a Book object with the given title and price
     * @param theTitle this Book's title
     * @param thePrice this Book's price
     */
    public Book(String theTitle, double thePrice)
    {
        title = theTitle;
        price = thePrice;
    }

    /**
     * Gets the price of this Book
     * @return the current price
     */
    public double getPrice()
    {
        return price;
    }

    /**
     * Gets the title for this Book
     * @return the title
     */
    public String getTitle()
    {
        return title;
    }

    @Override
    public String toString()
    {
        String s = getClass().getName() + "[title=" + title
            + ",price=" + price + "]";
        return s;
    }
}