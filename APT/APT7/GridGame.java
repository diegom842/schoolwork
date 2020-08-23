package APT7;

public class GridGame {
    char myGrid[][] = new char[4][4];

    public int winningMoves(String[] grid) {
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                myGrid[r][c] = grid[r].charAt(c);
            }
        }
        return findWins();

    }

    public int findWins()
    {
        int count = 0;
        for(int r = 0; r < 4; r++)
        {
            for(int c = 0; c < 4; c++)
            {
                if(isMoveLegal(r, c))
                {
                    myGrid[r][c] = 'X';
                    int opCount = findWins();
                    if(opCount == 0)
                    {
                        count++;
                    }
                    myGrid[r][c] = '.';
                }
            }
        }
        return count;
    }

    public boolean isMoveLegal(int r, int c)
    {
        if(myGrid[r][c] == 'X') return false;
        if(r > 0 && myGrid[r-1][c] == 'X') return false;
        if(r < 3 && myGrid[r+1][c] == 'X') return false;
        if(c > 0 && myGrid[r][c-1] == 'X') return false;
        if(c < 3 && myGrid[r][c+1] == 'X') return false;
        return true;
    }
}