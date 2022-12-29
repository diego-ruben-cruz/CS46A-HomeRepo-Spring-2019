/**
 * Write a description of class TicTacToeGame here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToeGame
{
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

    /**
     * Checks if the row is a winner and returns which player won, if any.
     *
     *@return   The value returned for later reference.   
     */
    private int rowCheck()
    {
        int value = 0;
        for (int row = 0; row < 3; row++)
        {
            if(array[row][0] == 1 &&array[row][1] == 1 && array[row][2] == 1)
            {
                value = PLAYER_1;
            }
            else if (array[row][0] == 2 &&array[row][1] == 2 && array[row][2] == 2)
            {
                value = PLAYER_2;
            }
            else if (array[row][0] == 0 &&array[row][1] == 0 && array[row][2] == 0)
            {
                value = -1;
            }
            else
            {
                value = NONE;
            }
        }
        return value;
    }

    /**
     * Checks if the column is a winner and returns which player won, if any.
     *
     *@return   The value returned for later reference.   
     */
    private int columnCheck()
    {
        int value = 0;
        for (int column = 0; column < 3; column++)
        {
            int row = 0;
            if(array[row][column] == 1 && array[row + 1][column] == 1 && array[row + 2][column] == 1)
            {
                value = PLAYER_1;
            }
            else if (array[row][column] == 2 && array[row + 1][column] == 2 && array[row + 2][column] == 2)
            {
                value = PLAYER_2;
            }
            else if (array[row][column] == 0 && array[row + 1][column] == 0 && array[row + 2][column] == 0)
            {
                value = -1;
            }
            else
            {
                value = NONE;
            }
        }
        return value;
    }

    /**
     * Checks if the column is a winner and returns which player won, if any.
     *
     *@return   The value returned for later reference.   
     */
    private int diagonalCheck()
    {
        int value = 0;
        int row = 0;
        int column = 0;
        if(array[row][column] == 1 && array[row + 1][column + 1] == 1 && array[row + 2][column + 2] == 1)
        {
            value = PLAYER_1;
        }
        else if (array[row][column] == 2 && array[row + 1][column + 1] == 2 && array[row + 2][column + 2] == 2)
        {
            value = PLAYER_2;
        }
        else if (array[row][column] == 0 && array[row + 1][column + 1] == 0 && array[row + 2][column + 2] == 0)
        {
            value = -1;
        }
        else if(array[row + 2][column] == 1 && array[row + 1][column + 1] == 1 && array[row][column + 2] == 1)
        {
            value = PLAYER_1;
        }
        else if(array[row + 2][column] == 2 && array[row + 1][column + 1] == 2 && array[row][column + 2] == 2)
        {
            value = PLAYER_2;
        }
        else if(array[row + 2][column] == 0 && array[row + 1][column + 1] == 0 && array[row][column + 2] == 0)
        {
            value = -1;
        }
        else
        {
            value = NONE;
        }

        return value;
    }

    /**
     * Checks for the winner of a given match.
     *
     * @return    The winner of the match, if any.
     */
    public int winner()
    {
        int winner = 100;
        this.rowCheck();
        if(this.rowCheck() == PLAYER_1)
        {
            winner = PLAYER_1;
        }
        else if(this.rowCheck() == PLAYER_2)
        {
            winner = PLAYER_2;
        }
        else if(this.rowCheck() == -1)
        {
            winner = -1;
        }
        else if (this.rowCheck() == NONE)
        {
            if(this.columnCheck() == PLAYER_1)
            {
                winner = PLAYER_1;
            }
            else if(this.columnCheck() == PLAYER_2)
            {
                winner = PLAYER_2;
            }
            else if(this.columnCheck() == -1)
            {
                winner = -1;
            }
            else if(this.columnCheck() == NONE)
            {
                if(this.diagonalCheck() == PLAYER_1)
                {
                    winner = PLAYER_1;
                }
                else if(this.diagonalCheck() == PLAYER_2)
                {
                    winner = PLAYER_2;
                }
                else if(this.diagonalCheck() == -1)
                {
                    winner = -1;
                }
                else if(this.diagonalCheck() == NONE)
                {
                    winner = 0;
                }
            }
        }
        return winner;
    }

    /**
     * Counts the number of empty spaces, and the moves made by each of the players.
     *
     *@return   The number of empty spaces, and the moves made by each of the players in an array.
     */
    public int[] counts()
    {
        int countplayer1 = 0;
        int countplayer2 = 0;
        int countzero = 0;
        for (int row = 0; row < array.length; row ++)
        {
            for (int column = 0; column < array[0].length; column++)
            {
                if (array[row][column] == 1)
                {
                    countplayer1++;
                }
                else if(array[row][column] == 2)
                {
                    countplayer2++;
                }
                else if(array[row][column] == 0)
                {
                    countzero++;
                }
            }
        }
        int[] result = {countzero, countplayer1, countplayer2};
        return result;
    }
}