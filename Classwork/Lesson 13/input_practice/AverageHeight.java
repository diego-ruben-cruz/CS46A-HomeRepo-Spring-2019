import java.util.Scanner;
public class AverageHeight
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean done = false;
        double sum = 0;
        double average = 0;
        int count = 0;
        while(!done)
        {
            System.out.print("Please enter height, Q to quit: ");
            double num = scan.nextDouble();
            System.out.print("Please enter height, Q to quit: ");
            while (scan.hasNextDouble())
            {
                if (num % 2 == 0)
                {
                    sum = sum + num;
                }
            }
            while(scan.hasNext())
            {
                String end = scan.next();
                if(end.toUpperCase().equals("Q"))
                {
                    done = true;
                    average = sum/count;
                    System.out.print("Average: " + average);
                }
            }
        }
    }
}
