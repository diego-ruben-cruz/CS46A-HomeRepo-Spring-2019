import java.util.Scanner;
public class StringProcessing
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a phase: ");
        String phrase = scan.nextLine();

        int count = 0;
        for(int i = count; i < phrase.length(); i++)
        {
            String ch = phrase.substring(i,i + 1).toLowerCase();
            if(ch.equals("o"))
            {
                count++;
            }
        }
        System.out.print(count);
    }
}
