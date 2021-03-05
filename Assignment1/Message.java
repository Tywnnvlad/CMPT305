import java.util.*;
/*
Gregory Edward Cal
180232

The Message class contains the necesarry information to show and process the result of the guess from the user
*/
public class Message{

    Random rand = new Random();
    //The word list
    private String[] message = {"Lakers","Warriors","Nets","Celtic","Raptors","Jazz","Clippers","Heat","Knicks","Bulls","Hornets","Rockets","Nuggets","Mavericks","Suns","Pelicans","Bucks","Wizards","Blazers","Spurs","Cavaliers","Timberwolves","Kings","Pistons"};

    
    private String word = message[rand.nextInt(message.length)].toUpperCase();//Pick a random word from the word list    
    private int wordLength = word.length();//This will store the size/length of the word    
    private int guessCount = wordLength;//A counter used to check if the user has won
    private String letterGuessed = "";//A blank string that will be used to store the user's guess
    private String blankString = "";//A string that will contain "_" and will also 
    // private String guessedString = "";//A string 


    /**
     * This method will be used to see if the user's guess ir correct or not it will also track if the user has won
     * @param c A char value that is the user's guess
     * @return It will return false if the user has an error and will return true if the user is correct
     */
    public boolean guess(char c){
        String prevLetterGuessed = letterGuessed;
        int prevGuessCount = guessCount;
        c = Character.toUpperCase(c);
        for (int i = 0; i < wordLength; i++) {
            if (c == word.charAt(i)){
                guessCount--;
            }
        }
        if(prevGuessCount == guessCount){
            return false;
        }
        else{
            letterGuessed += c;
            return true;}
    }

    /**
     * Method to check if the user has won
     * @return return true if the user has won else return false to keep playing
     */
    public boolean solved(){
        if(guessCount == 0){
            return true;
        }
        else return false;
    }
    
    /**
     * The method toString() is used to show the missing bits left for the user to guess
     * Will print the blanked area and guess letters
     * @return it will return the string to be printed
     */
    public String toString(){
        getGuessed();
        char[] output = new char[(blankString.length()*2)-1];
        for (int i = 0; i < output.length; i++) {
            if((i%2)==0){
                output[i] = blankString.charAt(i/2);
            }           
            else if((i%2)!=0){
                output[i] = ' ';
            }
        }
        String outputString = String.valueOf(output);        
        return outputString;
    }

    /**
     * The method is used to check the length of the word and produce a blanked string filled with "_"
     * @return will return a String with the exact length of the word but blanked with "_"
     */
    public String getBlank(){
        for(int i = 0; i < wordLength; i++){
            blankString += "_";
        }
        return blankString;
    }
    /**
     * The method is used to get the guess from the user and it will check if the user is correct. It will also replace the blanked String from getBlank() with the right letters if the user have guessed the right answer
     * 
     * @return Will produce the String that would be printed from toString(), which is the blanked word with the answer.
     */
    public String getGuessed(){
        StringBuilder newBlank = new StringBuilder(blankString);
        for (int i = 0; i < letterGuessed.length(); i++) {
            for (int j = 0; j < wordLength; j++) {
                if(letterGuessed.charAt(i) == word.charAt(j)){                   
                    newBlank.setCharAt(j, letterGuessed.charAt(i));
                }
            }       
        }        
        blankString = newBlank.toString();        
        return blankString;
    }
}
