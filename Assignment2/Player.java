/**
 * This class represents a player in a TicTacToe game
 */
public abstract class Player{

    private final char playerType;

/**
 * Initializes a Player object
 * @param c The symbol of the Player
 */
    public Player(char c){
        this.playerType = c;
    }
/**
 * Returns the symbol of the Player
 * @return The symbol of the Player
 */
    public char getPlayerType(){
        return playerType;
    }
/**
 * Calculates the next move for this Player
 * @param board An object Board used to choose the next move
 * @return A Move object consisting of the targetted row and column 
 */
    public abstract Move getMove(Board board);
}