
/**
 * Write a description of class ProductTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProductTester
{
    public static void main(String[] args)
    {
     Product thing = new Product("iPad",410.0);
     thing.reducePrice(10);
     thing.increasePrice(10);
     double price = thing.getPrice();
     String description = thing.getName();
     System.out.println(description + " " + price);
    }
}

