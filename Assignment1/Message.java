import java.util.Random;

public class Message{

    private String[] message = {"Lakers","Warriors","Nets","Celtic","Raptors","Jazz","Clippers","Heat","Knicks","Bulls","Hornets","Rockets","Nuggets","Mavericks","Suns","Pelicans","Bucks","Wizards","Blazers","Spurs","Cavaliers","Timberwolves","Kings","Pistons"};

    Random rand = new Random();
    public String word = message[rand.nextInt(message.length)];
    public int wordLength = word.length();
    public int guessCount = wordLength;
    public String letterGuessed = "";
    public String blankString = "";
    public String guessedString = "";



    public boolean guess(char c){
        String prevLetterGuessed = letterGuessed;
        int prevGuessCount = guessCount;
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
        return getBlank();
    }
/////////////////////////
    public String getWord(){
        return word;
    }
    public String getChar(){
        String newString = "";
        for(int i = 0; i < wordLength; i++){
            newString += word.charAt(i);
        }
        return newString;
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
                    System.out.println("j="+j+" i="+i +" letter:"+ letterGuessed.charAt(i));
                    newBlank.setCharAt(j, letterGuessed.charAt(i));
                }
            }       
        }
        blankString = newBlank.toString();
        return blankString;
    }
}
