import javax.swing.*;
import java.util.*; 
import java.lang.Object.*;


public class Hangman {
    public Message message;
    public Gallows gallows;
    public static void main(String[] args) {
        // Message message = new Message();
        // Gallows gallows = new Gallows();
        // Scanner sc = new Scanner(System.in);

        // System.out.println(message.getWord());        
        // System.out.println(message.getBlank());

        // while (message.solved() && gallows.isDead()){
        //     System.out.print("Guess a letter: ");
        //     String scanned = sc.nextLine();        
        //     message.guess(scanned.charAt(0));
        //     System.out.println("The letter you guessed was: "+message.letterGuessed);            
        //     System.out.println("Number of letters left: "+message.guessCount);
        //     System.out.println(message.getGuessed());
        // } 
        gameInitialize();

    }
    public static void gameInitialize(){

        Message message = new Message();
        Gallows gallows = new Gallows();
        Scanner sc = new Scanner(System.in);
        System.out.println(message.getWord());        
        System.out.println(message.getBlank());

        JOptionPane.showMessageDialog(null,"THIS IS A MESSAGE", "Hangman", JOptionPane.INFORMATION_MESSAGE);



        while (gallows.isDead()){
            System.out.print("Guess a letter: ");//
            String scanned = sc.nextLine(); 
            if(message.guess(scanned.charAt(0))){
                if(message.solved()){
                    System.out.println("CONGRATULATIONS!!! YOU HAVE WON");
                    return;
                }
            }else gallows.incrementHangman();       
            
            //System.out.println("The letter you guessed was: "+message.letterGuessed);
            //System.out.println("Life left: ")            
            //System.out.println("Number of letters left: "+message.guessCount);
            System.out.println(message.getGuessed()+"\n");
        } System.out.println("\nGAME OVER!");
    }
}