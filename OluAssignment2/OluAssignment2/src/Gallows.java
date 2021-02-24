/*
 * Olumide Olabimtan
 * 180146
 */

/**
 * A class to depict the gallows, and incrementally show the hangman as
 * a user guesses incorrectly
 */
public class Gallows {
	
	private int numIncorrGuesses; //A private data member to keep track of the number of incorrect guesses 
	
	private static final int MAX_INCORRECT_GUESSES = 8; //A user is only allowed 8 incorrect guesses, one for each part of the Gallows, 
														//and a final one, before the user loses
	/**
	 * A method to increment the number of incorrect guesses
	 */ 
	public void incrementHangman() 
	{
	
		numIncorrGuesses++;
		
	}
	
	/**
	 * A method to determine whether or not the player has lost. 
	 * @return Returns true if the player has 8 incorrect guesses, and false if not
	 */
	public boolean isDead() 
	{
		
		boolean isDead = true;
		
		if (numIncorrGuesses < MAX_INCORRECT_GUESSES ) //As long as the player has less than the maximum 8 guesses, 
													   //he has not lost, and may keep playing
		{
			isDead = false;
		}
		
		return isDead;
	
	}
	
	/**
	 * A method to override the toString() method in this class, 
	 * and to show the state of the gallows depending on the user's number of incorrect guesses (from 1 to 7)
	 * Prints nothing if the user doesn't have an incorrect guess
	 * @return Returns a String diagram showing the state of the gallows 
	 */
	public String toString() 
	{
		
		String gallows = ""; 
		
		if(numIncorrGuesses == 1)
		{
			gallows += "   _______     \n" +
					"  |               \n" +
					"  |               \n" +
					"  |               \n" + 
					"  |               \n" +
					"  |               \n" +
					"  |               \n" +
					"_|_               \n";
		}
		
		else if(numIncorrGuesses == 2)
		{
			gallows += "   _______        \n" +
				 "  |                |    \n" +
				 "  |                     \n" +

				 "  |                     \n" + 
				 "  |                     \n" +
				 "  |                     \n" +
				 "  |                     \n" +
				 "_|_                     \n";
		}
			
		else if(numIncorrGuesses == 3)
		{
			gallows += "   _______        \n" +
				 "  |                |    \n" +
				 "  |                |    \n" +
				 "  |                     \n" +
				 "  |                     \n" + 
				 "  |                     \n" +
				 "  |                     \n" +
				 "_|_                     \n";
		}
		
		else if(numIncorrGuesses == 4)
		{
			gallows += "   _______        \n" +
				 "  |                |    \n" +
				 "  |                |    \n" +
				 "  |               O     \n" +
				 "  |                     \n" +
				 "  |                     \n" +
				 "  |                     \n" +
				 "_|_                     \n";
		}
		
		else if(numIncorrGuesses == 5)
		{
			gallows += "   _______        \n" +
				 "  |                |    \n" +
				 "  |                |    \n" +
				 "  |               O     \n" +
				 "  |               \\|/  \n" +
				 "  |                     \n" +
				 "  |                     \n" +
				 "_|_                     \n";
		}
		
		else if(numIncorrGuesses == 6)
		{
			gallows += "   _______        \n" +
				 "  |                |    \n" +
				 "  |                |    \n" +
				 "  |               O     \n" +
				 "  |               \\|/  \n" +
				 "  |                |    \n" +				
				 "  |                     \n" +
				 "_|_                     \n";
		}
		
		else if(numIncorrGuesses == 7)
		{
			gallows += "   _______     \n" +
				 "  |                |    \n" +
				 "  |                |    \n" +
				 "  |               O     \n" +
				 "  |               \\|/  \n" +
				 "  |                |    \n" + 
				 "  |               / \\  \n" +
				 "_|_              \n";
		}
		
		return gallows;
	}

}
