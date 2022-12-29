import java.util.ArrayList;

public class ClocksViewer
{
    public static void main(String[] args)
    {
        ArrayList<Clock> clocks;

        //add clocks to the array list
        clocks = new ArrayList<Clock>();
        ColoredClock clock1 = new ColoredClock();
        clocks.add(clock1);
        Clock clock2 = new Clock();
        clock2.moveTo(100, 100);
        clocks.add(clock2);

        WorldClock clock3 = new WorldClock("Honolulu", -3);
        clock3.moveTo(0, 200);
        clocks.add(clock3);
        WorldClock clock4 = new WorldClock("London", 8);
        clock4.moveTo(100, 200);
        clocks.add(clock4);

        //draw the clocks
        for(int i = 0; i < clocks.size(); i++)
        {
            clocks.get(i).draw();
        }
    }
}
