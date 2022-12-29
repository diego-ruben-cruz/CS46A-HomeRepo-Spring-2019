public class Numbers
{
    /**
    Computes the number of even and odd values in a given array
    @param values an array of integer values
    @return an array of length 2 whose 0 entry contains the count
    of even elements and whose 1 entry contains the count of odd
    values
     */
    public static int[] evenOdds(int[] values)
    {
        int oddCount = 0;
        int evenCount = 0;
        int[] result = new int[2];
        for(int p : values)
        {
            if(p%2 == 0)
            {
                evenCount++;
            }
        }
        oddCount = values.length - evenCount;
        result[0] = evenCount;
        result[1] = oddCount;
        return result;
    }
}