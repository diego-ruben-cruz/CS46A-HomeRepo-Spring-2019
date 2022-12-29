import java.util.Arrays;
/**
 * Tests TicTacToeGame
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GamePrinter
{
    public static void main(String[] args)
    {
        int[][] win1 = {{ 1, 2, 1},
                         {2, 1, 2},
                         {2, 0, 1}
                        };
        
        TicTacToeGame game1 = new TicTacToeGame(win1);
        
        int[][] win0 = {{ 1, 1, 2},
                         {2, 2, 1},
                         {1, 2, 1}
                        };
        
        TicTacToeGame game2 = new TicTacToeGame(win0);      
        
        int[][] win2 = {{ 1, 0, 2},
                         {0, 1, 1},
                         {2, 2, 2}
                        };
        
        TicTacToeGame game3 = new TicTacToeGame(win2);
        
        System.out.println(game1.getBoard());
        System.out.println(game2.getBoard());        
        System.out.println(game3.getBoard());
        
    }
}