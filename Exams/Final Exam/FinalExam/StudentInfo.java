import java.util.Scanner;
/**
 * Write a description of class StudentInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentInfo
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("What is your major? ");
        String resp1 = input.nextLine();
        System.out.println(resp1);

        System.out.print("How many years have you been at SJSU? ");
        int resp2 = 0;
        if(!input.hasNextInt())
        {
            System.out.println("Not an int");
        }
        else
        {
            resp2 = input.nextInt();
            System.out.print("How much student debt do you have? ");
            double resp3 = 0;
            if(!input.hasNextDouble())
            {
                System.out.println("Not a double");
            }
            else 
            {
                resp3 = input.nextDouble();

                if(resp2 > 0)
                {
                    double average = resp3/resp2;
                    System.out.println(average + " per year");
                }
            }
        }
    }
}