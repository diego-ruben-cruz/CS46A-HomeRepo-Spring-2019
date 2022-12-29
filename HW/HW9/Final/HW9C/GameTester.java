import java.util.Arrays;
/**
 * Tests TicTacToeGame
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GameTester
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
        
        //test counts
        System.out.println(Arrays.toString(game1.counts()));
        System.out.println("Expected: [1, 4, 4]");
        System.out.println(Arrays.toString(game2.counts()));
        System.out.println("Expected: [0, 5, 4]");
        System.out.println(Arrays.toString(game3.counts()));
        System.out.println("Expected: [2, 3, 4]");
        
        //test winner
        System.out.println(game1.winner());
        System.out.println("Expected: 1");
        System.out.println(game2.winner());
        System.out.println("Expected: 0");
        System.out.println(game3.winner());
        System.out.println("Expected: 2");
        
        //test some more winning boards
        int[][] diagonal = { { 1, 1, 2},
                             {1, 2, 1},
                             {2, 2, 1}
                           };
        
        TicTacToeGame gameTester = new TicTacToeGame(diagonal);
        System.out.println(gameTester.winner());
        System.out.println("Expected: 2");
        
        int[][] column = { {2, 0, 1},
                           {1, 2, 1},
                           {2, 2, 1}
                           };
        gameTester = new TicTacToeGame(column);
        System.out.println(gameTester.winner());
        System.out.println("Expected: 1");
        
    }
}