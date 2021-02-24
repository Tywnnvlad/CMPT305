import javax.swing.JOptionPane;

/*
 * Olumide Olabimtan
 * 180146
 */

/**
 * A program for a single player hangman game
 */
public class Hangman 
{
	
	private Message message; //private data member of type Message
	
	private Gallows gallows; //private data member of type Gallows
	
	private int winsCounter; //private data member of type in to keep track of the user's number of wins
	
	private int lossesCounter; //private data member of type int to keep track of the user's number of losses
	
	private char answer; ////private data member of type char to record the user's decision to keep playing or to quit the game
	
	/**
	 *  Runs the Hangman() sequence and keeps running it until the user decides to stop playing
	 * @param args Not used
	 */
	public static void main(String[] args) 
	{
		
		new Hangman();
				
	}
	
	/**
	 * Constructor for the Hangman class. Runs the playHangman() method to play the game and runs it until the user chooses to stop playing
	 */
	public Hangman() 
	{
			
		playHangman(); // Calls the playHangman() method
		
		while(answer == 'y') //As long as the user chooses "y", the game will keep playing.
		{
			playHangman();
		}
		
		if(answer == 'n') //If the user chooses to stop playing, the game will display the user's number of wins and losses, overall win record
		{
			JOptionPane.showMessageDialog(null, "Wins: " + winsCounter + "\n" + "Losses: " + lossesCounter, "Hangman", JOptionPane.INFORMATION_MESSAGE);
			if(winsCounter > lossesCounter) //If the user has more wins than losses
			{
				JOptionPane.showMessageDialog(null, "Overall, YOU WIN!!!.", "Hangman", JOptionPane.INFORMATION_MESSAGE);
			}
			else if(winsCounter < lossesCounter) //If the user has more losses than wins
			{
				JOptionPane.showMessageDialog(null, "Overall, You lose.", "Hangman", JOptionPane.INFORMATION_MESSAGE);
			}
			else //If the user has as many wins as losses
			{
				JOptionPane.showMessageDialog(null, "Overall, Meh.", "Hangman", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
		
		
	}
	
	/**
	 * Method to run a single game of Hangman
	 */
	public void playHangman()
	{
		
		gallows = new Gallows();
		message = new Message();
		
		String guess; //the user's guess of type String
		
		while(!gallows.isDead()) //As long as the user has less than 8 incorrect guesses, he/she will be prompted for more guesses
		{
		
			guess = JOptionPane.showInputDialog(null,  "Please guess a letter: " + " \n" + message.toString() + " \n" + gallows.toString(), "Hangman", JOptionPane.QUESTION_MESSAGE);
			
			char charGuessed = requestGuess(guess).charAt(0); //the user's guess of type char
			
			if(message.guess(charGuessed) == false) //If the user's guess is not a part of the message (the random word chosen from the list), 
			{										//then the number of incorrect guesses gets increased by 1.
				
				gallows.incrementHangman();
						 
			}
			
			if(message.solved()) //If the user has won, then the game stops, and a victory message is printed
			{
				JOptionPane.showMessageDialog(null, "You win!!!", "Hangman", JOptionPane.INFORMATION_MESSAGE);
				
				winsCounter++;
				
				break;
			}
			
			if(gallows.isDead()) //If the user has lost, then the game stops, and a losing message is printed
			{
				JOptionPane.showMessageDialog(null, "Sorry, you lose.", "Hangman", JOptionPane.INFORMATION_MESSAGE);
				
				lossesCounter++;
				
				break;
			}
			
		}	
		
		String answerString = JOptionPane.showInputDialog(null, "Play again? (y/n): ", "Hangman", JOptionPane.QUESTION_MESSAGE); //the user is asked whether or not they would like to play again
		
		answer = requestAnswer(answerString).charAt(0); //the user's response of type char
			
	}
	
	/**
	 * Method to ensure the user enters a valid guess for the game
	 * @param guess The user's guess
	 * @return Returns the user's guess after making sure it is valid
	 */
	public String requestGuess(String guess) 
	{		
		while(guess == null || guess.length() <= 0) //Loop to keep asking for the user's guess if it isn't at least 1 character long
        {
            guess = JOptionPane.showInputDialog(null, "Please enter a valid guess: " + " \n" + message.toString() + " \n" + gallows.toString(), "Hangman", JOptionPane.QUESTION_MESSAGE);
            
        }
		
		return guess;
	}
	
	/**
	 * Method to ensure the user enters a valid answer for the game
	 * @param answer The user's answer
	 * @return Returns the user's answer after making sure it is valid
	 */
	public String requestAnswer(String answer)
	{		
		while(answer == null || answer.length() <= 0)
        {
			
			answer = (JOptionPane.showInputDialog(null, "Play again? (y/n): ", "Hangman", JOptionPane.QUESTION_MESSAGE));
			
        }
		
		
		
		return answer;
	}

}
