
/**
 * Models a number that is manipulated by commands.
 *
 * @author DCruzin
 * @version 2.28.2019
 */
public class MyNumber
{
    // instance variables - replace the example below with your own
    private int input;

    /**
     * Constructor for objects of class MyNumber
     * 
     * @param firstInt  The initial value of the integer.
     */
    public MyNumber(int firstInt)
    {
        // initialise instance variables
        this.setNumber(firstInt); 
    }

    /**
     * Gets the current value of the integer.
     *
     * @return    The current number
     */
    public int getNumber()
    {
        // put your code here
        if (input < 0)
        {
            input = input * -1;
        }

        return input;
    }

    /**
     * Sets a new value of the integer.
     * 
     * @param   newNum      The new number being set
     *
     * @return    the new value
     */
    public void setNumber(int newNum)
    {
        input = newNum;
        if (input < 0)
        {
            input = input*-1;
        }
    }

    /**
     * Counts the amount of digits in the number.
     *
     * @return    The number of digits in the number.
     */
    public int digitCount()
    {
        String counter = input + "";
        return counter.length();
    }

    /**
     * 
     *
     * @return  The new number with commas every three digits.
     */
    public String formatWithCommas()
    {
        String result = new String("");
        if (input < 1000000) 
        {
            String inputConvert = new String(input + "");
            if(inputConvert.length() <= 3)
            {
                result = inputConvert;
            }
            else if (inputConvert.length() == 4)
            {
                result = inputConvert.substring(0,1) + "," 
                    + inputConvert.substring(1,inputConvert.length()); 

            }
            else if (inputConvert.length() == 5)
            {
                result = inputConvert.substring(0,2) + "," + 
                    inputConvert.substring(2,inputConvert.length()); 

            }
            else if (inputConvert.length() == 6)
            {
                result = inputConvert.substring(0,3) + "," + 
                    inputConvert.substring(3,inputConvert.length()); 

            }
        } 
        else
        {
            result = "too big";
        }
        return result;
    }
}
