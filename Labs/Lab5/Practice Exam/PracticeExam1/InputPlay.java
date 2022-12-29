
/**
 * Write a description of class InputPlay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class InputPlay
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your favorite color: ");
        String favColor = input.nextLine().toLowerCase();
        System.out.print("Enter the color of your shirt: ");
        String shirtColor = input.nextLine().toLowerCase();
        if (favColor.equals(shirtColor))
        {
            System.out.println("Good choice");
        }
        else
        {
            System.out.println("You like variety");
        }
        System.out.print("Enter a double: ");
        double num1 = input.nextDouble();
        System.out.print("Enter a second double: ");
        double num2 = input.nextDouble();
        if (num2 != 0)
        {
            System.out.println(num1/num2);
        }
        else
        {
            System.out.println("Can not divide by 0");
        }
        
    }
}