import javax.swing.*;
import java.util.*; 
import java.lang.Object.*;


public class Hangman {
    public Message message;
    public Gallows gallows;
    public static void main(String[] args) {
        gameInitialize();
    }
    public static void gameInitialize(){

        Message message = new Message();
        Gallows gallows = new Gallows();
        Scanner sc = new Scanner(System.in);
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

            //System.out.println(message.toString()+"\n");
        } JOptionPane.showMessageDialog(null,message.toString()+gallows.toString()+"YOU ARE DEAD!", "GAMEOVER!", JOptionPane.INFORMATION_MESSAGE);
        gameReset();
    }
    public static  void gameReset(){
        String answer ="";
        while(answer != null){
            answer = JOptionPane.showInputDialog(null,"Would you like to play again? Y/N","Hangman",JOptionPane.QUESTION_MESSAGE);
            char key = Character.toUpperCase(answer.charAt(0));
            if(key == 'Y'){
                gameInitialize();
            }else System.exit(1);
        }
    }
}