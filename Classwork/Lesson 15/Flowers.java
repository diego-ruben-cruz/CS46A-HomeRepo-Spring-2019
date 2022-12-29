
/**
 * Woring with ArrayLists
 *
 * @author K O'Brien
 */
import java.util.ArrayList;
public class Flowers
{
    public static void main(String[] args)
    {
        ArrayList<String> garden = new ArrayList<String>();
        garden.add("rose");
        garden.add("daisy");
        garden.add("violet");
        System.out.println(garden);
        garden.add(0, "petunia");
        garden.add(2, "pansy");
        System.out.println(garden);
        garden.set(2, "marigold");
        System.out.println(garden);
        System.out.println("Size: " + garden.size());
        System.out.println(garden.get(garden.size() - 1));
        garden.set(garden.size() - 1, "zinnia");
        String temp = garden.get(0);
        garden.set(0, garden.get(1));
        garden.set(1, temp);
        System.out.println(garden);
        String swap = garden.get(2);
        garden.remove(2);
        garden.add(swap);
        System.out.println(garden);
        System.out.println();
        System.out.println("Using Loops...");
        System.out.println();
        System.out.println("*Enhanced*");
        for(String p : garden)
        {
            System.out.println(p);
        }
        System.out.println();
        System.out.println("*Traditional*");
        for (int i = 0; i < garden.size(); i++)
        {
            System.out.println(garden.get(i));
        }
        System.out.println();
        System.out.println("Notice any difference?");
        System.out.println();
        System.out.println("Converting into uppercase...");
        for(int c = 0; c < garden.size(); c++)
        {
            String term = garden.get(c);
            term = term.substring(0,1).toUpperCase() + term.substring(1, term.length()); 
            garden.set(c, term);
        }
        System.out.println(garden);
    }
}
