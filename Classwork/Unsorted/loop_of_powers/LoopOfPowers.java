public class LoopOfPowers
{
    public static void main(String[] args)
    {
       final int TWO = 2;
       int power = 1;
       while (power <= 10)
       {
       while(power%2 == 1)
       {
           System.out.println(Math.pow(TWO,power));
           power++;
        }
    }
    }
}
