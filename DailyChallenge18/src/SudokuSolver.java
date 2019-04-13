public class SudokuSolver
{
    private static int[][] board = {
        {8,0,0,0,0,0,0,0,0},
        {0,0,3,6,0,0,0,0,0},
        {0,7,0,0,9,0,2,0,0},
        {0,5,0,0,0,7,0,0,0},
        {0,0,0,0,4,5,7,0,0},
        {0,0,0,1,0,0,0,3,0},
        {0,0,1,0,0,0,0,6,8},
        {0,0,8,5,0,0,0,1,0},
        {0,9,0,0,0,0,4,0,0}
    };
    
    public static void main(String[] args)
    {
        solve();
        printBoard();
    }
    
    private static void printBoard()
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                System.out.print(board[i][j]);
            }
    
            System.out.print("\n");
        }
    }
    
    private static boolean isInLine(int row, int col, int number)
    {
        for (int i = 0; i < 9; i++)
        {
            if ((board[i][col] == number) || (board[row][i] == number)) return true;
        }
        
        return false;
    }
    
    private static boolean isInBox(int row, int col, int number)
    {
        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;
        
        for (int i = boxRow; i < boxRow + 3; i++)
        {
            for (int j = boxCol; j < boxCol + 3; j++)
            {
                if (board[i][j] == number) return true;
            }
        }
        
        return false;
    }
    
    private static boolean isOk(int row, int col, int number)
    {
        return !isInLine(row, col, number) && !isInBox(row, col, number);
    }
    
    private static boolean solve()
    {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                if (board[i][j] == 0)
                {
                    for (int k = 1; k < 10; k++)
                    {
                        if (isOk(i, j, k)) board[i][j] = k;
                        else continue;
                        
                        if (solve()) return true;
                    }
                    
                    board[i][j] = 0;
                    return false;
                }
            }
        }
        
        return true;
    }
}
