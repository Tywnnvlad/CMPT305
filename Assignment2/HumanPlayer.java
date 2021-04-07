import javax.swing.JOptionPane;
/**
 * This class represents a player in a TicTacToe game
 */
public class HumanPlayer extends Player{

/**
 * Initializes a Player object
 * @param c The symbol of the Player
 */    
    public HumanPlayer(char c){
        super(c);
    }

/**
 * Calculates the next move for this Human Player using JOptionPane
 * @param board An object Board used to choose the next move
 * @return A Move object consisting of the targetted row and column 
 *  
 * 
 */   
    public Move getMove(Board board){
        String input = JOptionPane.showInputDialog(null,"Please enter the x,y value separated by ',' ",JOptionPane.QUESTION_MESSAGE);

        String[] arrInput = input.split(",");
        int row = Integer.parseInt(arrInput[0]);
        int column = Integer.parseInt(arrInput[1]);
        Move playerMove = new Move(row,column);
        return playerMove;
    }

}
