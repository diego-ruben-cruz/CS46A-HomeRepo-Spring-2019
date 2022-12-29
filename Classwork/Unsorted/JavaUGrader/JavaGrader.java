import java.util.Scanner;
public class JavaGrader
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the grade given? ");
        String input = scan.nextLine();
        String inputConvert = input.substring(0,1).toUpperCase();
        double grade = 0;
        if (inputConvert.equals("A"))
        {
            grade = 4.0;
            System.out.println(grade);
        }
        
        else if (inputConvert.equals("B"))
        {
          grade = 3.0;
            System.out.println(grade);
        }
        else if (inputConvert.equals("C"))
        {
            grade = 2.0;
            System.out.println(grade);
        }
        else if (inputConvert.equals("D"))
        {
            grade = 1.0;
            System.out.println(grade);
        }
        else if (inputConvert.equals("F"))
        {
            grade = 0.0;
            System.out.println(grade);
        }
        else
        {
            grade = -1.0;
            System.out.println(grade);
        }
    }
}