/**
 * Gregory Edward Cal
 * 180232
 * 
 * The Gallow class will track if the user has lost and will output the gallow that will represent how much life/errors they have left
 */

public class Gallows{

    private int errorCount;
    private static final int MAXLIFE = 8;
    private  int life = MAXLIFE;

    /**
     * Increment the error if the user has made an error
     */
    public void incrementHangman(){        
        errorCount++;
    }

    /**
     * Check if the user has died, this will determine if the program will stop or not
     * @return return true if the user is out of lives, return false if still alive
     */
    public boolean isDead(){
        if (errorCount == life) return false;
        else return true;
    }

    /**
     *@return This will return a String that will represent the life of the user.
     */
    public String toString(){
        String gallowMsg = "";
        if(errorCount == 1){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 2){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |             \n"+
            " |             \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 3){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |             \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 4){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |         /    \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 5){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |         / \\    \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 6){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |         / \\    \n"+
            " |          |    \n"+
            " |              \n"+
            "_|_              \n";
        }
        if(errorCount == 7){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |         / \\    \n"+
            " |          |    \n"+
            " |         /    \n"+
            "_|_              \n";
        }
        if(errorCount == 8){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |          |    \n"+
            " |          O   \n"+
            " |          |   \n"+
            " |         / \\    \n"+
            " |          |    \n"+
            " |         / \\    \n"+
            "_|_              \n";
        }
        if(errorCount == 0){
            gallowMsg += "\n"+
            "   _________     \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            " |              \n"+
            "_|_              \n";
        }
        return gallowMsg;
    }
}