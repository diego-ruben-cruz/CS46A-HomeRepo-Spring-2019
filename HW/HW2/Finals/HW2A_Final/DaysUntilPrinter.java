/**
 * Manipulate Day objects
 * @author Diego Cruz
 */
public class DaysUntilPrinter
{
    public static void main(String[] args)
    {
        Day today = new Day();
        Day sprOut = new Day(2019,4,1);
        System.out.println(sprOut.daysFrom(today));
        today.addDays(30);
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
        System.out.println("The date is " + today.toString());
        //do not change this line
    }
}