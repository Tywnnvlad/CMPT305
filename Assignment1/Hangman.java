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
        System.out.println(message.getWord());        
        System.out.println(message.getBlank());        

        while (gallows.isDead()){

            String guess = JOptionPane.showInputDialog(null, message.toString()+gallows.toString(),"Hangman",JOptionPane.QUESTION_MESSAGE);
            if(guess == null){
                System.exit(1);
            }
            
            if(message.guess(guess.charAt(0))){
                if(message.solved()){
                    JOptionPane.showMessageDialog(null,message.toString()+gallows.toString()+"YOU HAVE WON!!", "WINNER WINNER!", JOptionPane.INFORMATION_MESSAGE);
                    return;
                }
            }else gallows.incrementHangman();    

            System.out.println(message.toString()+"\n");
        } JOptionPane.showMessageDialog(null,message.toString()+gallows.toString()+"YOU ARE DEAD!", "GAMEOVER!", JOptionPane.INFORMATION_MESSAGE);
    }
    
}