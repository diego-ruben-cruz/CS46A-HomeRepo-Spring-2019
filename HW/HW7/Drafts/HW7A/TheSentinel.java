
/**
 * Models computation involving various integer inputs.
 *
 * @DCruzin
 * 
 * @3.19.19
 */
import java.util.Scanner;
public class TheSentinel
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        boolean done = false;
        int sum = 0;
        int num = 0;
        while(!done)
        {
            System.out.print("Enter an integer or Q to quit: ");
            if(sum == 0 && num == 0 && !input.hasNextInt())
            {
                System.out.println("no input");
                done = true;
                break;
            }
            while(input.hasNextInt())
            {
                System.out.print("Enter an integer or Q to quit: ");
                num = input.nextInt();
                if(num % 2 == 0)
                {
                    sum = sum + num;
                }
                if (num % 1 != 0)
                {
                    System.out.println(sum);
                    done = true;
                }
            }
            while(input.hasNext())
            {
                String end = input.next();
                if(end.toUpperCase().equals("Q"))
                {
                    System.out.println(sum);
                    done = true;
                }
                else
                {
                    System.out.println(sum);
                    done = true;
                }
            }
        }
    }
}