
/**
 * Write a description of class BetterAnimal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BetterAnimal extends Animal
{
    private int max;
    /**
     * Constructor for objects of class BetterAnimal
     * 
     * @param   theMax  The max energy cap of the animal.
     * 
     */
    public BetterAnimal(int theMax)
    {
        super();
        max = theMax;
    }

    /**
     * Has the animal eat to replenish its energy.
     *
     * @param  amountToEat  The amount that the energy will increase.
     * 
     */
    public void eat(int amountToEat)
    {
        if (amountToEat > 0)
        {
            int currentEnergy = super.getEnergy();
            int addition = currentEnergy + amountToEat;
            int difference = addition - max;
            if (addition > max)
            {
                super.eat(amountToEat - difference);
            }
            else
            {
                super.eat(amountToEat);
            }
        }       
    }

    /**
     * Has the animal move which loses it energy.
     *
     * @param  amountToMove  The amount by which the energy decreases.
     */
    public void move(int amountToMove)
    {
        if (amountToMove > 0)
        {
            int currentEnergy = super.getEnergy();
            if (amountToMove > currentEnergy)
            {
                super.move(currentEnergy);
            }
            else
            {
                super.move(amountToMove);
            }
        }         
    }
}
