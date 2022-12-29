import java.util.Scanner;
public class Text
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter text: ");
        String str = input.nextLine();
        System.out.println("Length: "+ str.length());
        System.out.println("1st character: " + str.substring(0,1));
        System.out.println("Last character index: " + (str.length() - 1));
        System.out.println("Last character: " + 
            str.substring(str.length() - 1,str.length()));
        System.out.println("1st space index: " + str.indexOf(" "));
        System.out.println("1st word: " + str.substring(0, str.indexOf(" ")));
    }
}