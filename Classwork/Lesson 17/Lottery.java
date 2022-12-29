import java.util.Random;
import java.util.ArrayList;
public class Lottery
{
    private int[] array;
    /**
     * Constructor for objects of class lotto
     * 
     * @param   size    The size of the lottery pool.
     * 
     */
    public Lottery(int size)
    {
        array = new int[size];
    }
    
    /**
     * Gets a combination of random numbers of a given length that are less than 100.
     * 
     * @param   n    The size of the number pool.
     * 
     * @return      the newly formed number pool.
     * 
     */
    public int[] getCombination(int n) 
    { 
        Random rng = new Random();
        array = new int[n];
        for(int p = 0 ; p < n; p++)
        {
            array[p] = rng.nextInt(100);
        }
        return array;
    }
    
    /**
     * Prints the current number pool.
     */
    public void printer()
    {
        for(int p : array)
        {
            System.out.println(p);
        }
    }

    public static void main (String[] args)
    {
        Lottery lotto = new Lottery(20);
        lotto.getCombination(10);
        lotto.printer();
    }
}