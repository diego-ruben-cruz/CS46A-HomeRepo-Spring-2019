
/**
 * Write a description of class Professors here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Professors
{
    public static void main(String[] args)
    {
        ArrayList<String> professors = new ArrayList<String>();
        professors.add("Heller");
        professors.add("Kim");
        professors.add("O'Brien");
        professors.add("Wesley");
        professors.add("Stamp");
        System.out.println("*Enhanced*");
        for(String p : professors)
        {
            System.out.println(p);
        }
        System.out.println();
        System.out.println("*Traditional*");
        for (int i = 0; i < professors.size(); i++)
        {
            System.out.println(professors.get(i));
        }
        System.out.println();
        System.out.println("Notice any difference?");
    }
}
