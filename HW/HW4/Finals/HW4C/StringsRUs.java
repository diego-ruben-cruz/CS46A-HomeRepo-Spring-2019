/**
 * 
 * @author DCruzin
 * @version 2.20.19
 */
import java.util.Scanner;
public class StringsRUs
{
    public static void main(String[] args)
    {
        Scanner scanLine = new Scanner(System.in);
        System.out.print("Favorite author? ");
        String input = scanLine.nextLine();
        String firstInit = input.substring(0,1);
        String lastInit = input.substring(input.length() - 1, input.length());
        System.out.println(firstInit + lastInit);
        String firstName = input.substring(0,input.indexOf(" "));
        System.out.println(firstName);
        String restOfName = input.substring(input.indexOf(" ")+1,input.length());
        System.out.println(restOfName);
        String threeChar = input.substring(4,7);
        System.out.println(threeChar);
    }
}