/**
 * This class represents the Board of the TicTacToe game
 */

public class Board{
    private int row ;
    private int column ;
    private Player[][] array;
    private int isTie;
/**
 * Creates a Board object for the game
 * @param r the max row length of a board
 * @param c the max row length of a board
 */
    public Board(int r, int c){
        this.row = r;
        this.column = c;
        this.array = new Player[row][column];
        this.isTie = r*c;
    }

/**
 * A method used to return the number of rows
 * @return The amount of rows
 */    
    public int getRows(){
        return row;
    }
/**
 * A method used to return the number of columns
 * @return The amount of columns
 */
    public int getColumns(){
        return column;
    }
/**
 * A method to return a reference of a Player to a given spot 
 * @param row The row to be checked
 * @param column The column to be checked
 * @return a reference to the Player who owns the tile or null if no one owns it
 */
    public Player getPlayerAtLocation(int row, int column){
        return array[row][column];
    }
/**
 * A method to check if there is a winner in the game
 * @return a reference to the Player who wons the game or null if none
 */
    public Player win(){
        Player winnerwinnerchickendinner = null;
        boolean chicken = false;
        //Check for a row win
        for(int i = 0; i < row; i++){            
            winnerwinnerchickendinner = array[i][0];
            if(winnerwinnerchickendinner == null){
                continue;
            }
            chicken = true;
            for(int j = 0; j < column; j++){
                if(winnerwinnerchickendinner != array[i][j]){
                    chicken = false;
                    break;
                }
            }
            if(chicken == true)
            return winnerwinnerchickendinner;            
        }
        //check for a column win
        for(int i = 0; i < column; i++){
            winnerwinnerchickendinner = array[0][i];
            if(winnerwinnerchickendinner == null){
                continue;
            }
            chicken = true;
            for(int j = 0; j < row; j++){
                if(winnerwinnerchickendinner != array[j][i]){
                    chicken = false;
                    break;
                }
            }
            if(chicken == true)
            return winnerwinnerchickendinner;
        }
        //check for diagonal
        if(row == column){
            winnerwinnerchickendinner = array[0][0];
            if(winnerwinnerchickendinner != null){
                for(int i = 0; i < row; i++){
                
                    if (winnerwinnerchickendinner != array[i][i]){
                        chicken = false;
                        break;
                    }
                    chicken = true;
                }   
            }
            if(chicken == true)
            return winnerwinnerchickendinner;

            int j = 0;
            winnerwinnerchickendinner = array[row-1][0];           
            if(winnerwinnerchickendinner != null){
                for(int i = row-1; i >= 0; i--){                
                    if(winnerwinnerchickendinner != array[i][j]){
                        chicken = false;
                        break;
                    }
                    chicken = true;
                    j++;
                }
            }
            if(chicken == true)                
            return winnerwinnerchickendinner;
        }
        return null;
    }
/**
 * A method to check if the game is a tie
 * @return true if the game has ended in a tie, false otherwise
 */
    public boolean tie(){
        if(isTie == 0){
            return true;
        }
        else return false;
    }
/**
 * A method to do a Players move and check if it is legal
 * @param row The targeted row
 * @param column The targeted column
 * @param player a reference to the Player making the move
 * @return true if the move is legal, false if ilegal
 */
    public boolean makeMove(int row, int column, Player player){
        row-=1;
        column-=1;
        if(array[row][column] == null){
            array[row][column] = player;
            isTie--;
            return true;
        }
        else return false;
    }
}