public class Board 
{
    
    private String[][] board = new String[3][3];
    private static int ROW = 3; 
    private static int COLUMN = 3;
    private static String BLANK = " ";
    private static String X = "X";
    private static String O = "O";
    private Player player = new Player();
    
    
    public String[][] createBoard()
    {
        for(int i = 0; i < ROW; i++)
        {
            for(int j = 0; j < COLUMN;j++)
            board[i][j] = BLANK;
        }
        return board;
    }
    
    public void displayBoard()
    {
        System.out.println("\n\t" + board[0][0] + "  |" + board[0][1] + "  |" + board[0][2]);
        System.out.println("\t-----------");
        System.out.println("\t" + board[1][0] + "  |" + board[1][1] + "  |" + board[1][2]);
        System.out.println("\t-----------");
        System.out.println("\t" + board[2][0] + "  |" + board[2][1] + "  |" + board[2][2] + "\n");
        
    }
    
   
    
    public boolean updateBoard(int row,int column,boolean first)
    {
        
        if(board[row][column].equals(BLANK))
        {
            if(first)
            {
                board[row][column] = "X";
                return true;
            }
            else
            {
                board[row][column] = "O"; 
                return true;
            }
        }
        return false;

    }
    
   /* public String[][] getBoard()
    {
        return board;
    }*/
}