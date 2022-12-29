import java.util.Scanner;
public class JavaFactory
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter price: ");
        double num = input.nextDouble();
        double newPrice = num*(2.0/3);
        System.out.printf("$%.2f", newPrice);
    }
}