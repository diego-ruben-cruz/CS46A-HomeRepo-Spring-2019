
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
        int min = num + 1;
        int countnegs = 0;
        int countsevens = 0;
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
                if (num < min)
                {
                    min = num;
                }
                if(num % 2 == 0)
                {
                    sum = sum + num;
                }
                if (num % 1 != 0)
                {
                    System.out.println(sum);
                    done = true;
                }
                if (num == 7)
                {
                    countsevens++;
                }
                if (num < 0)
                {
                    countnegs++;
                }
            }
            while(input.hasNext())
            {
                String end = input.next();
                if(end.toUpperCase().equals("Q"))
                {
                    System.out.println(sum);
                    System.out.println(min);
                    if(countsevens > 0)
                    {
                        System.out.println("7 is my lucky number");
                    }
                    else
                    {
                        System.out.println("no sevens");
                    }
                    System.out.println(countnegs);
                    done = true;
                }
                else
                {
                    System.out.println(sum);
                    System.out.println(min);
                    if(countsevens > 0)
                    {
                        System.out.println("7 is my lucky number");
                    }
                    else
                    {
                        System.out.println("no sevens");
                    }
                    System.out.println(countnegs);
                    done = true;
                }
            }
        }
    }
}