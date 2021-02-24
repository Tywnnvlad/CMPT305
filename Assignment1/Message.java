import java.util.*;

public class Message{

    private String[] message = {"Lakers","Warriors","Nets","Celtic","Raptors","Jazz","Clippers","Heat","Knicks","Bulls","Hornets","Rockets","Nuggets","Mavericks","Suns","Pelicans","Bucks","Wizards","Blazers","Spurs","Cavaliers","Timberwolves","Kings","Pistons"};

    Random rand = new Random();
    private String word = message[rand.nextInt(message.length)].toUpperCase();
    private int wordLength = word.length();
    private int guessCount = wordLength;
    private String letterGuessed = "";
    private String blankString = "";
    private String guessedString = "";



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


    public boolean solved(){
        if(guessCount == 0){
            return true;
        }
        else return false;
    }

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

    public String getBlank(){
        for(int i = 0; i < wordLength; i++){
            blankString += "_";
        }
        return blankString;
    }

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
