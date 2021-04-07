/**
 *@author Gregory Cal
 *@since March 22, 2021
 *@version 1.0
 *
 *This class will manage the game TicTacToe
 */

public class TicTacToe {
    private Board board; 
    private Player xxx; 
    private Player ooo;
    private BoardShow graphics;
/**
 * Creates a TicTacToe game with default values
 */
    public TicTacToe(){
        this.board = new Board(3,3);
        this.xxx = new HumanPlayer('X');
        this.ooo = new RandomPlayer('O');
        this.graphics = new BoardShow(board,"TICTACTOE",xxx,ooo);
    }
/**
 * Creates a TicTacToe game with the given values 
 * @param r the number of row of the board
 * @param c the number of column of the board
 */
    public TicTacToe(int r, int c){
        this.board = new Board(r,c);
        this.xxx = new HumanPlayer('X');
        this.ooo = new RandomPlayer('O');
        this.graphics = new BoardShow(board,"TICTACTOE",xxx,ooo);
    }
/**
 * Creates a TicTacToe object and initializes the game
 * @param args the command line arguments which are the number of rows and columns if there are atleast 2
 */
    public static void main(String[] args) {
        TicTacToe game = null;     

        if(args.length >= 2){
            try {
                game = new TicTacToe(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
            } catch (Exception e) {
                System.out.println("Invalid Input");
                System.exit(0);
            }
        }
        else game = new TicTacToe();

        game.playTicTacToe();
    }
/**
 * Plays a game of TicTacToe using this object
 */
    public void playTicTacToe(){
        Player myTurn = xxx;
        Move currentMove;
        
       while(!board.tie()&&(board.win()==null)){
            do{
            currentMove = myTurn.getMove(board);
            graphics.updateBoard(board);
            }
            while(!board.makeMove(currentMove.getRow(),currentMove.getColumn(),myTurn));

           if(myTurn == xxx){ 
               myTurn = ooo;
           }
           else{
               myTurn = xxx;
           }
        
       }
       
    }
}
