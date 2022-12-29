
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
        for(String place : countries)
        {
            System.out.println(place);
        }
    }
}
