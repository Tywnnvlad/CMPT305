import javax.swing.JOptionPane;
import java.util.Random;

/**
 * This class represents a player in a TicTacToe game
 */
public class RandomPlayer extends Player{
 /**
 * Initializes a Player object
 * @param c The symbol of the Player
 */        
    public RandomPlayer(char c){
        super(c);
    }
/**
 * Calculates the next move for this Random Player using an advanced AI
 * @param board An object Board used to choose the next move
 * @return A Move object consisting of the targetted row and column 
 *  
 * 
 */       
    public Move getMove(Board board){
        Random r = new Random();
        int movex = r.nextInt(board.getRows())+1;
        int movey = r.nextInt(board.getColumns())+1;
        Move playerMove = new Move(movex,movey);
        
        return playerMove;
    }
}
