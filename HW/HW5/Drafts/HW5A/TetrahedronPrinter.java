import java.util.Scanner;
public class TetrahedronPrinter
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the edge length: ");
        double edgeLength = input.nextDouble();
        System.out.printf("%.2f%n", edgeLength);
    }
}