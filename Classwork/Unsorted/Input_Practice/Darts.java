import java.util.Scanner;
public class Darts
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int input = 0;
        int sum = 0;
        int count = 0;
        System.out.print("Please enter a score, Q to quit: ");
        while(scan.hasNextInt())
        {
            System.out.print("Please enter a score, Q to quit: ");
            input = scan.nextInt();
            sum = sum + input;
            count++;
        }
        System.out.println("Sum: " + sum);
        System.out.println("Count: " + count);
        double average = (double)sum/(count);
        System.out.println("Average: " + average);
    }

}

