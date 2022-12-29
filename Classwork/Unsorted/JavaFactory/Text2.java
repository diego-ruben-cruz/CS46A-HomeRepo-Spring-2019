import java.util.Scanner;
public class Text2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter text: ");
        String str = input.nextLine();
        System.out.println("Phrase: " + str);
        String firstWord = str.substring(0, str.indexOf(" "));
        System.out.println("First word: " + firstWord);
        int firstWordLength = firstWord.length();
        System.out.println("First word length: " + firstWordLength);
        
    }
}