import java.util.Scanner;
public class TempLoop
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double temperature = 0;
        System.out.print("Enter the temperature, Q to quit: ");
        while (scan.hasNextDouble())
        {
            temperature = scan.nextDouble();
            //do something with the temperature
            System.out.print("Enter the temperature, Q to quit: ");
        }
    }
}
