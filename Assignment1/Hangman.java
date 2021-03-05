import javax.swing.*;
import java.util.*; 
import java.lang.Object.*;

/**
 * Gregory Edward Cal
 * 180232
 * 
 * The Hangman class will produce the classic Hangman game where the user has to guess the word. They only have 8 lives/errors to guess the word.
 * 
 *Requires a Message class
 *Requires a Gallows class 
 */

public class Hangman {
    private Message message;
    private Gallows gallows;

    /**
     * Run the gameInitialize() sequence and run the game
     * @param args
     */
    public static void main(String[] args) {
        gameInitialize();
    }

    /**
     * This will initialize the game.
     */
    public static void gameInitialize(){

        Message message = new Message();
        Gallows gallows = new Gallows();
        message.getBlank();       

        while (gallows.isDead()){

            String guess = JOptionPane.showInputDialog(null, message.toString()+gallows.toString(),"Hangman",JOptionPane.QUESTION_MESSAGE);
            if(guess == null){
                System.exit(1);
            }
            
            if(message.guess(guess.charAt(0))){
                if(message.solved()){
                    JOptionPane.showMessageDialog(null,message.toString()+gallows.toString()+"YOU HAVE WON!!", "WINNER WINNER!", JOptionPane.INFORMATION_MESSAGE);
                    gameReset();
                    return;
                }
            }else gallows.incrementHangman();    

        } JOptionPane.showMessageDialog(null,message.toString()+gallows.toString()+"YOU ARE DEAD!", "GAMEOVER!", JOptionPane.INFORMATION_MESSAGE);
        gameReset();
    }

    /**
     * This method will be used to ask if the user would like to keep playing after they lost or won
     */
    public static  void gameReset(){
        String answer ="";
        while(answer != null){
            answer = JOptionPane.showInputDialog(null,"Would you like to play again? Y/N","Hangman",JOptionPane.QUESTION_MESSAGE);
            char key = Character.toUpperCase(answer.charAt(0));
            if(key == 'Y'){
                gameInitialize();
            }else System.exit(1);
        }System.exit(1);
    }
}