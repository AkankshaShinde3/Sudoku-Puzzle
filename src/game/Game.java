package game;
import board.Board;
import player.Player;

public class Game {

    Board board;
    Player player;
    
    public Game(Board board, Player player){
        this.board = board;
        this.player = player;
    }

    public void play()
    {
        sudokuSolver(0, 0);
    }

    
    public void sudokuSolver(int row, int col){
        
        if(row == board.size)
        {
            System.out.println("Sudoku SOLVED!!!");
            board.printBoard();
            return;
        }
        
        int nextRow = 0, nextCol = 0;

        if(col == (board.size-1))
        {
            nextRow = row + 1;
            nextCol = 0; //we need to bring the column to start i.e zero
        }
        else
        {
            nextRow = row;
            nextCol = col + 1;
        }

        if(board.matrix[row][col] != 0){
            sudokuSolver(nextRow, nextCol);
        }
        else
        {
            for(int i=1; i<=9; i++){
                if(isValid(board.matrix, row, col, i) == true){
                    board.matrix[row][col] = i;
                    sudokuSolver(nextRow, nextCol);
                    board.matrix[row][col] = 0;
                }
            }
        }
    }
    
    public boolean isValid(int matrix[][], int row, int col, int val)
    {
        
        for(int i=0; i<matrix.length; i++)
        {
            if(matrix[row][i] == val)
            {
                return false;
            }
        }
    
        for(int i=0; i<matrix.length; i++)
        {
            if(matrix[i][col] == val)
            {
                return false;
            }
        }
    
        int tempRow = row/3 * 3;
        int tempCol = col/3 * 3;
    
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                if(matrix[tempRow + i][tempCol + j] == val)
                {
                    return false;
                }
            }
        }    
        return true;
    }
}