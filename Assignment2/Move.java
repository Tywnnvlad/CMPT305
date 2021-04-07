/**
 * This class reperesents a move in a TicTacToe game
 */

public class Move {


    private int row;
    private int column;
/**
 * Creates a Move object for the game
 * @param r the targeted row
 * @param c the targeted column
 */
    public Move(int r, int c){
        this.row = r;
        this.column = c;
    }
/**
 * A method that will return the targeted row
 * @return The targeted row for this object
 */
    public int getRow(){
        return row;
    }
/**
* A method that will return the targeted column
* @return The targeted column for this object
*/
    public int getColumn(){
        return column;
    }
}
