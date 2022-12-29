/**
 * Messes with Strings and your favorite author's name.
 *
 * @author DCruzin
 * @version 2.20.19
 */
import java.util.Scanner;
public class StringsRUs2
{
    // instance variables - replace the example below with your own
    private Scanner scanLine = new Scanner(System.in);
    /**
     * Constructor for objects of class StringRUs
     */
    public StringsRUs2()
    {
    }

    /**
     * Extracts the first and last initials of an Author's name.
     *
     */
    public void authorInit()
    {
        System.out.print("Favorite author? ");
        String input = scanLine.nextLine();
        String firstInit = input.substring(0,1);
        String lastInit = input.substring(input.length() - 1, input.length());
        System.out.print(firstInit + lastInit);
    }
    public static void main(String[] args)
    {
        StringsRUs2 tester = new StringsRUs2();
        tester.authorInit();
    }
}
