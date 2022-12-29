
/**
 * Write a description of class TicTacToeGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToeGame
{
    // instance variables - replace the example below with your own
    public static final int NONE = 0; //indicates a free space
    public static final int PLAYER_1 = 1; //indicates a space marked by player 1
    public static final int PLAYER_2 = 2; //indicates a space marked by player 2
    private int[][] array;
    /**
     * Constructor for objects of class TicTacToeGame
     * 
     * @param   given   the given 2D array to work with
     * 
     */
    public TicTacToeGame(int[][] given)
    {
        array = given;
    }

    /**
     * Draws the board.
     *
     *@return   The game that took place.
     */
    public String getBoard()
    {
        String result = "";
        for(int[] p : array)
        {
            String convert = "";
            for(int c : p)
            {
               convert = convert + c + " ";  
            }
            result = result + convert + "\n";
        }
        return result;
    }
}