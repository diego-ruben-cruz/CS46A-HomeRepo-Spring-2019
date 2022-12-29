import java.util.Scanner;
public class InputTest
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        do
        {
            System.out.print("Please enter a positive integer: ");
            input = scan.nextInt();
        }
        while(!(input > 0));
    }
}
