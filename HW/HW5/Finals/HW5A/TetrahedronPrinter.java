import java.util.Scanner;
public class TetrahedronPrinter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the edge length: ");
        double edgeLength = input.nextDouble();
        if (edgeLength < 0)
        {
            System.out.println("Edge can not be negative");
        }
        else
        {
            double surfArea = Math.sqrt(3)*Math.pow(edgeLength, 2);
            System.out.printf("%.2f%n", surfArea);
            double height = Math.sqrt(2.0/3)*edgeLength;
            System.out.printf("%.2f%n", height);
        }
        
    }
}