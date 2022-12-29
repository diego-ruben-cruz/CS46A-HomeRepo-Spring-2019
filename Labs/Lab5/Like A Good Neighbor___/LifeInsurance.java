
/**
 * Write a description of class LifeInsurance here.
 *
 * @author (DCruzin)
 * @version (3.5.19)
 */
import java.util.Scanner;
public class LifeInsurance
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your sex: ");
        String sex = input.nextLine().substring(0,1).toUpperCase();
        System.out.print("Please enter your age: ");
        int age = input.nextInt();
        input.nextLine();
        System.out.print("Please state whether you smoke or not: ");
        String smokeStatus = input.nextLine().substring(0,1).toUpperCase();
        System.out.print("Please enter the city you live in: ");
        String residence = input.nextLine().toLowerCase();
        double insuranceCost = 0;
        if (sex.equals("M"))
        {
            insuranceCost = 1000;
        }
        else if(sex.equals("F"))
        {
            insuranceCost = 750;
        }
        if (age < 30)
        {
            insuranceCost = insuranceCost*.90;
        }
        if (smokeStatus.equals("Y"))
        {
          insuranceCost = insuranceCost*1.50;  
        }
        if (residence.equals("new york city"))
        {
            insuranceCost = insuranceCost + 100;
        }
        else if (residence.equals("los angeles"))
        {
            insuranceCost = insuranceCost + 100;
        }
        System.out.println("Insurance Cost: " + insuranceCost);
    }
}
