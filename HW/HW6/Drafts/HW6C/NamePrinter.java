/**
 *  Tester for Name class
 */
public class NamePrinter
{
    public static void main(String[] args)
    {
        Name name = new Name("Wilson Chu");
        System.out.println(name.listLetters());
        name = new Name("Jesus Rojas");
        System.out.println(name.listLetters());
    }
}