
/**
 * Write a description of class Food here.
 *
 * @DCruzin
 * @version (a version number or a date)
 */
public class Food extends Product
{
    private double mgC;
    public static final int MDR = 65;
    /**
     * Constructor for objects of class Food
     * 
     * @param   desc    The description of the product.
     * 
     * @param   thePrice    The given price of the product
     * 
     * @param   themgC  The given quantity of vitamin C.
     */
    public Food(String desc, double thePrice, double themgC)
    {
        super(desc, thePrice);
        mgC = themgC;
    }

    /**
     * Gets the amount of vitamin C in milligrams.
     *
     * @return    the amount of vitamin C.
     */
    public double getVitaminC()
    {
        return mgC;
    }

    /**
     * How many servings of this food are needed to meet the minimum daily requirement
     * 
     * @return    The servings needed to meet the minimum daily requirement.
     */
    public double howMuch()
    {
        return 0;
    }
}
