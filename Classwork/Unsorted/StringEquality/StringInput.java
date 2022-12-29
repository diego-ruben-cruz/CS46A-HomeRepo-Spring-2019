import java.util.Scanner;
public class StringInput
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your favorite color? ");
        String input = scan.nextLine();
        if(input.toLowerCase().equals("blue"))
        {
            System.out.println("Mine, too!");
        }
        else     
        {
            System.out.println("That's pretty, too");
        }

    }
}