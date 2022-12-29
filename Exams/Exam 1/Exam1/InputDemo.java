
/**
 *
 * @author DCruzin
 * @version 3.7.19
 */
import java.util.Scanner;
public class InputDemo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your favorite animal? ");
        String animal = input.nextLine();
        String lowerConversion = animal.toLowerCase();
        System.out.println(lowerConversion);
        if (lowerConversion.equals("cat"))
        {
            System.out.println("wise choice");
        }
        if (lowerConversion.equals("mountain lion"))
        {
            System.out.println("Dangerous, but beautiful");
        }
        System.out.print("Enter an integer: ");
        int userInt = input.nextInt();
        if (userInt < 0)
        {
            System.out.println("negative");
        }
        else if (userInt == 0)
        {
            System.out.println("zero");
        }
        else
        {
            System.out.println("positive");
        }
    }
}