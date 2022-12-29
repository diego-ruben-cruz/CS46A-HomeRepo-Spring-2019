
/**
 * Models a Waterflask containing water.
 *
 * @author Diego
 * @version 2.13.19
 */
public class WaterFlask
{
    private int givenLimit;
    private int givenNum;

    /**
     * Constructs a new WaterFlask Object
     * 
     * @param capacity  A given amount that represents current limit + amount.
     */
    public WaterFlask(int capacity)
    {
        givenLimit = capacity;
        givenNum = 0;
    }

    /**
     * Gives the capacity of the WaterFlask object.
     *  
     * @return  the capacity of the WaterFlask.
     */
    public int getMaxCapacity()
    {
        return givenLimit;
    }

    /**
     * Gives the current amount of the WaterFlask object.
     *  
     * @return  the amount of mL present in the WaterFlask.
     */
    public int getAmount()
    {
        return givenNum;
    }

    /**
     * Removes a defined amount of mL from the current amount.
     *  
     *  @param amountToDrink    The amount of water (in mL) that is drank.
     *  
     */
    public void drink(int amountToDrink)
    {
        givenNum = givenNum - amountToDrink;
        if (givenNum < 0)
        {
            givenNum = 0;
        }
    }

    /**
     * Fills the WaterFlask to max capacity.
     *  
     *  
     */
    public void fill()
    {
        givenNum = 0;
    }
}
