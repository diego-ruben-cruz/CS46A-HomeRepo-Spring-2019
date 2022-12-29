
/**
 * Valentine Calc.
 * @Diego Cruz
 * @version (a version number or a date)
 */
public class DayPrinter
{
    public static void main(String[] args)
    {
        Day today = new Day();
        Day vDay = new Day(2019, 2, 14);
        int daysFrom = vDay.daysFrom(today);
        System.out.println(daysFrom);
        today.addDays(10);
        System.out.println(today.toString());
        System.out.println(today.getYear());
        System.out.println(today.getMonth());
        System.out.println(today.getDayOfMonth());
    }
}
