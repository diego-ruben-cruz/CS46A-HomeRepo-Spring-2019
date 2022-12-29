
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class CountryList
{
    public static void main(String[] args)
    {
        ArrayList<String> countries = new ArrayList<String>();
        countries.add("China");
        countries.add("India");
        countries.add("Mexico");
        countries.add("Peru");
        countries.add(1, "Spain");
        countries.set(2, "Vietnam");
        countries.set(countries.size()-2, "Brazil");
        countries.remove("China");
        System.out.println(countries.get(0) + "***");
        System.out.println(countries.toString());
        for(String index : countries)
        {
            System.out.println(index);
        }
    }
}
