
/**
 * Write a description of class Animal here.
 *
 * @DCruzin
 * @5.7.19
 */
public class Animal
{
    private int energy;

    /**
     * Constructor for objects of class Animal
     */
    public Animal()
    {
        energy = 1;
    }

    /**
     * Has the animal eat to replenish its energy.
     *
     * @param  amountToEat  The amount that the energy will increase.
     * 
     */
    public void eat(int amountToEat)
    {
        energy = energy + amountToEat;
    }
    
    /**
     * Has the animal move which loses it energy.
     *
     * @param  amountToMove  The amount by which the energy decreases.
     */
    public void move(int amountToMove)
    {
        energy = energy - amountToMove;
    }
    
    /**
     * An example of a method - replace this comment with your own
     *
     * @return    The energy left in the animal.
     */
    public int getEnergy()
    {
        return energy;
    }
}
