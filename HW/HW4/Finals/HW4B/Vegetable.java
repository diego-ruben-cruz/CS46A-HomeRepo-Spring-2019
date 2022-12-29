
/**
 * Prints out whatever Veggie you want and then some.
 *
 * @author DCruzin
 * @version 2.20.19
 */
import java.util.*;
public class Vegetable
{
    public static void main(String[] args)
    {
        Scanner scanBoi = new Scanner(System.in);
        System.out.print("Enter your favorite vegetable: ");
        String input = scanBoi.nextLine();
        System.out.println(input);
        System.out.print("On average, how many serving of vegetables do you eat per day?: ");
        double input2 = scanBoi.nextDouble();
        System.out.println(input2);
        System.out.print("How many times a week do you eat vegetables?: ");
        int input3 = scanBoi.nextInt();
        double output = input2*input3;
        System.out.println("Vegetables per week: " + output);
        System.out.println((int) output);
    }

}
