
/**
 * Write a description of class Test1 here.
 *
 * @author DCruzin
 * @version 2.28.19
 */
import java.util.Scanner;
public class Test1
{
    public static void main(String[] args)
    {
        Scanner scanBoi = new Scanner(System.in);
        System.out.println("Please enter a sentence: ");
        String input = scanBoi.nextLine();
        if (input.length()%2 == 0)
        {
            System.out.println("There is an even amount of characters");
        }
        else
        {
            System.out.println("There is an odd amount of characters");
        }
        if (input.length() > 10)    
        {
            System.out.println("The sentence is greater than 10 characters.");
        }
        else if (input.length() < 10)
        {
            System.out.println("The sentence is lesser than 10 characters.");
        }
        else
        {
            System.out.println("The sentence is equal to 10 characters.");
        }
        
    }
}
