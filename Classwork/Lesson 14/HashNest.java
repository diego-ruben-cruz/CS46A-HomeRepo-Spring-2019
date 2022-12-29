
/**
 * Write a description of class AstNest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HashNest
{
    public static void main(String[] args)
    {
        int num;
        int limit = 1;
        for(int row = 1; row <= 6; row++)
        {
            for(num = 1; num <= limit; num++)
            {
                System.out.print("#");
            }
            System.out.println();
            limit++;
        }
    }
}
