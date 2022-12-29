
public class Board
{
    public static void main(String[] args)
    {
        int[][] board = new int[8][8];
        for (int row = 0; row < board.length; row ++)
        {
            for (int column = 0; column < board[0].length; column++)
            {
                if((row + column) % 2 == 0)
                {
                    board[row][column] = 0;
                }
                else
                {
                    board[row][column] = 1;
                }
            }
        }

        for (int row = 0; row < board.length; row ++)
        {
            for (int column = 0; column < board[0].length; column++)
            {
                System.out.print(board[row][column] + " ");
            }
            System.out.println();
        }
    }

}

