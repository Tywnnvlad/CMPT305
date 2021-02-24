import javax.swing.*;
import java.util.*; 
import java.lang.Object.*;


public class Hangman {
    public static void main(String[] args) {
        Message message = new Message();
        Gallows gallows = new Gallows();
        Scanner sc = new Scanner(System.in);

        System.out.println(message.getWord());        
        System.out.println(message.getBlank());

        System.out.print("Guess a letter: ");
        String scanned = sc.nextLine();        
        message.guess(scanned.charAt(0));

        System.out.println("The letter you guessed was: "+message.letterGuessed);
        
        System.out.println("Number of letters left: "+message.guessCount);
        System.out.println(message.getGuessed());     
    }
}