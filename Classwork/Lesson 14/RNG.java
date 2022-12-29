
/**
 * Write a description of class RNG here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class RNG
{
    public static void main(String[] args)
    {
        Random rng = new Random();
        int num1 = rng.nextInt(50);
        System.out.println(num1);
        int num2 = rng.nextInt(20);
        System.out.println(num2);
        int num3 = rng.nextInt(50) + 1;
        System.out.println(num3);
        int num4 = rng.nextInt(25) + 1;
        System.out.println(num4);
        int num5 = rng.nextInt(11) + 20;
        System.out.println(num5);
    }
}
