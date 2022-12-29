/**
 * Models a number.
 *
 * @DCruzin
 * @3.14.19
 */
public class NumberLoops
{

    /**
     * Constructor for objects of class NumberLoops
     */
    public NumberLoops()
    {
        // initialise instance variables
    }

    /**
     * Gets the product of every third number.
     *
     * @param  limit  A quantity of reference.
     * @return  The calculation    
     */
    public double sumEveryThird(int limit)
    {
        // put your code here
        double calculation = 1.0;
        int counter;
        for (counter = 1; counter < limit; counter++ )
        {
            if(counter%3 == 0 && counter%5 != 0)
            {
                calculation = calculation * counter;
            }
        }

        return calculation;
    }

    /**
     * Prints numbers up to a certain limit.
     *
     * @param  limit  A quantity of reference.
     * @return  The numbers up to said limit.
     */
    public String printNumbersUpTo(int limit)
    {
        // put your code here
        String convertSpace = "";
        for(int count = 0; count < limit; count++)
        {
            if (!(count%10 == 9))
            {
                String conversion = count + "";
                convertSpace = convertSpace + " " + conversion + " ";
            }
            else if(count%10 == 9)
            {
                String conversion = count + "";
                convertSpace = convertSpace + " " + conversion + "\n";
            }
        }
        return convertSpace; 
    }
}