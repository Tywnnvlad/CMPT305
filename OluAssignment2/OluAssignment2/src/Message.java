import java.util.*;

/*
 * Olumide Olabimtan
 * 180146
 */

/**
 * A class that contains all the information about the word the user is expected to guess
 */
public class Message 
{
	
	private final String[] wordList = {"Balerion","Meraxes","Vhagar","Charlemagne","Alexander",
			"Oluminides","Tashbaan","Niklaus","Sepehr","Eragon","Jaime","Cersei","Loras","Perseus",
			"Kaiser","Einhard","Grayson","Bruce","Aslan","Clark"}; 
			//The list of 20 words from which the user will have to guess
	
	private int index; //An integer to define the index of the word list, this number will be chosen randomly 
	
	private String message; //Any random word chosen from the list of words, it is from this word the user will have to guess the characters.
	
	private char[] spacedMessage; //An array of the letters in the message. 
								   //This array has a longer length than the message so it can accommodate for spaces between characters
	
	private char[] guessArray; //The array in which the user's guesses will be placed and displayed. It is as long as the spacedMessage array and also allows for spaces between the characters.
							  //It will use the spacedMessage to evaluate the guesses
	/**
	 * Constructor for the class. All the private data members in this class are initialized in the constructor
	 */
	public Message()
	{
		
		Random random = new Random();
		
		index = random.nextInt(wordList.length); //The index is any random number from 0 to 19
		
		message = wordList[index].toLowerCase(); //The word is chosen randomly from the list (e.g Alexander) It is changed to lowercase.
		
		spacedMessage = new char[(message.length()*2) - 1]; //This array takes the characters of the random word. 
													//It is larger because it incorporates spaces between the characters.
		
		guessArray = new char[(message.length()*2) - 1]; //This array evaluates and displays (if correct) the user's guess.
													 //It is the same length as the spacedMessage array, because it compares the user's guess with the spacedWord
		
		for(int i = 0; i < guessArray.length; i++) //initializes the guessArray to contain blank spaces with gaps.
		{										  //(e.g {_, ,_, ,_, ,_, ,_, ,_})									  
			if((i % 2) == 0)
			{
				guessArray[i] = '_';
			}
			else if((i % 2) != 0)
			{
				guessArray[i] = ' ';
			}
					
		}
		
		for(int j = 0; j < spacedMessage.length; j++ ) //This loop places the characters from the random word in their corresponding 
		{											//positions in the spacedMessage(e.g word: Aslan; spacedMessage:{A, ,s, ,l, ,a, ,n})
			
			if((j % 2) == 0){
				spacedMessage[j] = message.charAt(j/2);
			}
			  
		}
		
	}
	
	/**
	 * Method to evaluate if the user's guess is correct or not
	 * @param c Used to denote the user's character guess
	 * @return returns true if the user's guess is correct and false if it isn't
	 */
	public boolean guess(char c) 
	{
		boolean result = false;
		
		for(int i = 0; i < spacedMessage.length; i++) 
		{
			
			if(c == spacedMessage[i]) { //If the user's guess is correct, the guess is placed in the guessArray at the appropriate position 
				guessArray[i] = c;
				
				if(c == spacedMessage[0])
					guessArray[0] = Character.toUpperCase(c); //The first character is changed to uppercase to mirror the word as it appears in the list 
				
				result = true;
			}				
			
		}
		
		return result;		
	}
	/**
	 * A method to determine if the user has won the game or not
	 * @return returns true if the user has won and false if not
	 */
	public boolean solved()
	{
		
		boolean solved = true;
		
		for(int i = 0; i < guessArray.length; i++) //if there are any blank spaces left in the guessArray, then the user has not won
		{										  //(e.g {A, ,_, ,l, ,a, ,n}
			
			if(guessArray[i] == '_')			
				solved = false;
					
		}
		
		return solved;
	}

	/**
	 * A method to override the to override the toString() method in this class 
	 * and to print the current state of the user's game.
	 * It prints the wordArray entries 
	 */
	public String toString() 
	{
		
		String state = "";
		
		for(int i = 0; i < guessArray.length; i++) 
		{
			
			state += guessArray[i];
			
		}
				
		return state;
	}
	
	
}
